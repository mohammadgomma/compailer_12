package ast;

// Import Alias
public class ImportAliasNode extends ASTNode {
    private final String name;
    private final String alias;

    public ImportAliasNode(int line, int column, String name, String alias) {
        super(line, column);
        this.name = name;
        this.alias = alias;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitImportAliasNode(this);
    }

    public String getName() {
        return name;
    }

    public String getAlias() {
        return alias;
    }
}
