package symboltable;

public class Symbol {
    private final String name;
    private final String type; // "variable", "function", "parameter", "imported"
    private final String dataType; // "int", "string", "function", etc.
    private final int line;
    private final int column;
    private final String scopeName;

    public Symbol(String name, String type, String dataType, int line, int column, String scopeName) {
        this.name = name;
        this.type = type;
        this.dataType = dataType;
        this.line = line;
        this.column = column;
        this.scopeName = scopeName;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDataType() {
        return dataType;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    public String getScopeName() {
        return scopeName;
    }

    @Override
    public String toString() {
        return String.format("Symbol{name='%s', type='%s', dataType='%s', line=%d, column=%d, scope='%s'}",
                name, type, dataType, line, column, scopeName);
    }
}
