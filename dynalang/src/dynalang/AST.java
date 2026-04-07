package dynalang;

import java.util.ArrayList;
import java.util.List;

/**
 * This class hierarchy represents expressions in the abstract syntax tree
 * manipulated by this interpreter.
 * 
 * @author hridesh
 * 
 */
public interface AST {
	public static abstract class ASTNode {
		public abstract <T> T accept(Visitor<T> visitor);
	}
	public static class Program extends ASTNode {
		Exp _e;

		public Program(Exp e) {
			_e = e;
		}

		public Exp e() {
			return _e;
		}
		
		public <T> T accept(Visitor<T> visitor) {
			return visitor.visit(this);
		}
	}
	public static abstract class Exp extends ASTNode {

	}

	public static class NumExp extends Exp {
		double _val;

		public NumExp(double v) {
			_val = v;
		}

		public double v() {
			return _val;
		}
		
		public <T> T accept(Visitor<T> visitor) {
			return visitor.visit(this);
		}
	}

	public static abstract class BinaryExp extends Exp {
		Exp _left;
		Exp _right;

		public BinaryExp(Exp left, Exp right) {
			_left  = left;
			_right = right;
		}

		public Exp getLeft() {
			return _left;
		}

		public Exp getRight() {
			return _right;
		}
	}

	public static abstract class UnaryExp extends Exp {
		Exp _e;

		public UnaryExp(Exp e) {
			_e = e;
		}

		public Exp getExp() {
			return _e;
		}
	}


	public static class AddExp extends BinaryExp {
		public AddExp(Exp left, Exp right) {
			super(left, right);
		}
		public <T> T accept(Visitor<T> visitor) {
			return visitor.visit(this);
		}
	}

	// YOUR CODE HERE


	public interface Visitor <T> {
		// This interface should contain a signature for each concrete AST node.
		public T visit(AST.Program e);
		public T visit(AST.NumExp e);
		public T visit(AST.AddExp e);

		// YOUR CODE HERE
	}	
}
