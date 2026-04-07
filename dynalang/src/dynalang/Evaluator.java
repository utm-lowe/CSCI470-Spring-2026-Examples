package dynalang;
import static dynalang.AST.*;
import static dynalang.Value.*;

import java.util.List;

public class Evaluator implements Visitor<Value> {
	
	Printer.Formatter ts = new Printer.Formatter();
	
	Value valueOf(Program p) {
		// Value of a program in this language is the value of the expression
		return (Value) p.accept(this);
	}

	@Override
	public Value visit(Program p) {
		return (Value) p.e().accept(this);
	}
	
	@Override
	public Value visit(AddExp e) {
		// evaluate the left and right 
		double left = ((NumVal) e.getLeft().accept(this)).v();
		double right = ((NumVal) e.getRight().accept(this)).v();

		// calculate the result
		double result = left + right;

		return new NumVal(result);
	}

	@Override
	public Value visit(NumExp e) {
		return new NumVal(e.v());
	}

	// YOUR CODE HERE
}
