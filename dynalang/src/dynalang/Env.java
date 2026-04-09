package dynalang;

import java.util.TreeMap;
import dynalang.Value.*;


public class Env
{
    // symbol table of the environment
    private TreeMap<String, Value> tab;

    public Env()
    {
        tab = new TreeMap<String,Value>();
    }

    public void set(String name, Value v) {
        tab.put(name, v);
    }

    public Value get(String name) {
        Value v = tab.get(name);

        // A very dangerous thing
        if(v == null) {
            v = new StrVal(""); // <- We hate our users
            tab.put(name, v);
        }

        return v;
    }
}