package symboltable;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SymbolTable {
    private final Stack<Scope> scopes;
    private final List<Symbol> allSymbols;
    private Scope globalScope;

    public SymbolTable() {
        this.scopes = new Stack<>();
        this.allSymbols = new ArrayList<>();
        initGlobalScope();
    }

    private void initGlobalScope() {
        globalScope = new Scope("global", "global", null);
        scopes.push(globalScope);
    }

    public void enterScope(String name, String type) {
        Scope newScope = new Scope(name, type, currentScope());
        scopes.push(newScope);
    }

    public void exitScope() {
        if (scopes.size() > 1) {
            scopes.pop();
        }
    }

    public Scope currentScope() {
        return scopes.peek();
    }

    public Scope getGlobalScope() {
        return globalScope;
    }

    public void define(String name, String type, String dataType, int line, int column) {
        Symbol symbol = new Symbol(name, type, dataType, line, column, currentScope().getName());
        currentScope().define(symbol);
        allSymbols.add(symbol);
    }

    public Symbol resolve(String name) {
        return currentScope().resolve(name);
    }

    public List<Symbol> getAllSymbols() {
        return allSymbols;
    }

    public void printSymbolTable() {
        System.out.println("\n" + "===========================");
        System.out.println("SYMBOL TABLE");
        System.out.println("===========================");

        printScopeRecursive(globalScope, 0);

        System.out.println("\n" + "----------------------------");
        System.out.println("All Symbols Summary:");
        System.out.println("----------------------------");
        for (Symbol symbol : allSymbols) {
            System.out.printf("  %-20s | Type: %-12s | DataType: %-10s | Line: %-4d | Scope: %s\n",
                    symbol.getName(), symbol.getType(), symbol.getDataType(),
                    symbol.getLine(), symbol.getScopeName());
        }
        System.out.println("=============================");
    }

    private void printScopeRecursive(Scope scope, int level) {
        String indent = "  "+ level;
        System.out.println(indent + "Scope: " + scope.getName() + " (" + scope.getScopeType() + ")");

        for (Symbol symbol : scope.getSymbols().values()) {
            System.out.printf("%s  - %-15s [Line: %3d, Col: %3d] Type: %-10s DataType: %s\n",
                    indent, symbol.getName(), symbol.getLine(), symbol.getColumn(),
                    symbol.getType(), symbol.getDataType());
        }
    }

    public int getSymbolCount() {
        return allSymbols.size();
    }
}
