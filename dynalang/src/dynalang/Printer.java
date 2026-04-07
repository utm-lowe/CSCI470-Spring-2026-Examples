package dynalang;

import static dynalang.AST.*;

public class Printer {
	public void print(Value v) {
		System.out.println(v.toString());
	}
	
	public static class Formatter implements AST.Visitor<String> {
		
		public String visit(Program p) {
			return (String) p.e().accept(this);
		}
		
		public String visit(NumExp e) {
			return "" + e.v();
		}
		
		public String visit(AddExp e) {
			String result = e.getLeft().accept(this);
			result += " + ";
			result += e.getRight().accept(this);

			return result;
		}		

		// YOUR CODE HERE
	}
}
