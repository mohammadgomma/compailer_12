package symboltable;

import java.util.HashMap;
import java.util.Map;

public class Scope {
    private final String name;
    private final String scopeType; // "global", "function", "block"
    private final Scope parent;
    private final Map<String, Symbol> symbols;

    public Scope(String name, String scopeType, Scope parent) {
        this.name = name;
        this.scopeType = scopeType;
        this.parent = parent;
        this.symbols = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public String getScopeType() {
        return scopeType;
    }

    public Scope getParent() {
        return parent;
    }

    public void define(Symbol symbol) {
        symbols.put(symbol.getName(), symbol);
    }

    public Symbol resolve(String name) {
        Symbol symbol = symbols.get(name);
        if (symbol != null) {
            return symbol;
        }
        if (parent != null) {
            return parent.resolve(name);
        }
        return null;
    }

    public Symbol resolveLocal(String name) {
        return symbols.get(name);
    }

    public Map<String, Symbol> getSymbols() {
        return symbols;
    }

    @Override
    public String toString() {
        return String.format("Scope{name='%s', type='%s', symbolCount=%d}",
                name, scopeType, symbols.size());
    }
}
