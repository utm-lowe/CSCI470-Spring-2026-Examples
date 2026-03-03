package varlang;

import java.util.TreeMap;

/**
 * Representation of an environment, which maps variables to values.
 * 
 * @author hridesh
 *
 */
public interface Env {
	Value get (String search_var);
	Value set (String search_var, Value val);

	@SuppressWarnings("serial")
	static public class LookupException extends RuntimeException {
		LookupException(String message){
			super(message);
		}
	}
	
	static public class EmptyEnv implements Env {
		public Value get (String search_var) {
			throw new LookupException("No binding found for name: " + search_var);
		}

		public Value set (String search_var, Value val) {
			throw new LookupException("No binding found for name: " + search_var);
		}
	}
	
	static public class ExtendEnv implements Env {
		private Env _saved_env; 
		private String _var; 
		private Value _val; 
		public ExtendEnv(Env saved_env, String var, Value val){
			_saved_env = saved_env;
			_var = var;
			_val = val;
		}

		public Value get (String search_var) {
			if (search_var.equals(_var))
				return _val;
			return _saved_env.get(search_var);
		}

		public Value set (String search_var, Value val) {
			return _saved_env.set(search_var, val);
		}
	}

	static public class MapEnv implements Env {
		private TreeMap<String, Value> _symbols;
		private Env _saved_env;

		MapEnv() {
			this(new EmptyEnv());
		}

		MapEnv(Env saved_env) {
			_saved_env = saved_env;
			_symbols = new TreeMap<String, Value>();
		}

		public Value get(String search_var) {
			Value v = _symbols.get(search_var);

			if(v == null) {
				return _saved_env.get(search_var);
			}

			return v;
		}

		public Value set(String search_var, Value v) {
			_symbols.put(search_var, v);
			return v;
		}
	}
}
