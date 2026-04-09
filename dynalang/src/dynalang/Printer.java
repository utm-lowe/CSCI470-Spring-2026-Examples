package dynalang;

import static dynalang.AST.*;

public class Printer {
	public void print(Value v) {
		System.out.println(v.toString());
	}
	
	public static class Formatter implements AST.Visitor<String> {
		
		public String visit(Program p, Env env) {
			return (String) p.e().accept(this, env);
		}
		
		public String visit(NumExp e, Env env) {
			return "" + e.v();
		}
		
		public String visit(AddExp e, Env env) {
			String result = e.getLeft().accept(this, env);
			result += " + ";
			result += e.getRight().accept(this, env);

			return result;
		}		

		public String visit(AST.StringExp e, Env env) {
			return e.v();
		}

		public String visit(AST.AssignExp e, Env env) {
			String result = e.getLeft().accept(this, env);
			result += " = ";
			result += e.getRight().accept(this, env);

			return result;
		}

		public String visit(AST.PrintExp e, Env env)
		{
			return "print " + e.getExp().accept(this, env);
		}


		public String visit(AST.VarExp e, Env env)
		{
			return e.getName();
		}


		public String visit(AST.OpenExp e, Env env) {
			String result = "open ";
			result += e.getLeft().accept(this, env);
			result += " ";
			result += e.getRight().accept(this, env);

			return result;
		}
	}
}
