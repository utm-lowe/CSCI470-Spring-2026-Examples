package dynalang;
import static dynalang.AST.*;
import static dynalang.Value.*;

import java.util.List;

public class Evaluator implements Visitor<Value> {
	
	Printer.Formatter ts = new Printer.Formatter();
	
	Value valueOf(Program p, Env env) {
		// Value of a program in this language is the value of the expression
		return (Value) p.accept(this, env);
	}

	@Override
	public Value visit(Program p, Env env) {
		return (Value) p.e().accept(this, env);
	}
	
	@Override
	public Value visit(AddExp e, Env env) {
		Value left = e.getLeft().accept(this, env);
		Value right = e.getRight().accept(this, env);
		Value result;

		// select the proper semantic and coercion
		if(left instanceof NumVal && right instanceof NumVal) {
			double x = ((NumVal) left).v();
			double y = ((NumVal) right).v();

			result = new NumVal(x+y);
		} else {
			// coerce to strings
			String x = left.toString();
			String y = right.toString();

			result = new StrVal(x+y);
		}

		return result;
	}

	@Override
	public Value visit(NumExp e, Env env) {
		return new NumVal(e.v());
	}

	@Override
	public Value visit(AST.StringExp e, Env env)
	{
		String s = e.v();

		s = s.substring(1, s.length()-1);
		return new StrVal(s);
	}

	@Override
	public Value visit(AST.AssignExp e, Env env)
	{
		VarExp var = (VarExp) e.getLeft();
		Value v = e.getRight().accept(this, env);

		// stuff the result into the environment
		env.set(var.getName(), v);

		return v;
	}

	@Override
	public Value visit(AST.PrintExp e, Env env)
	{
		Value v = e.getExp().accept(this, env);
		System.out.println(v.toString());

		return v;
	}

	@Override
	public Value visit(AST.VarExp e, Env env)
	{
		return env.get(e.getName());
	}

	@Override
	public Value visit(AST.OpenExp e, Env env)
	{
		VarExp var = (VarExp) e.getLeft();
		Value v = new InFileVal(e.getRight().accept(this, env).toString());
		env.set(var.getName(), v);
		return v;
	}
}
