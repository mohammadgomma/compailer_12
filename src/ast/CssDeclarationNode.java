package ast;

public class CssDeclarationNode extends CssNode {
    private final String property;
    private final String value;

    public CssDeclarationNode(int line, int column, String property, String value) {
        super(line, column);
        this.property = property;
        this.value = value;
    }

    public String getProperty() {
        return property;
    }

    public String getValue() {
        return value;
    }

    @Override
    public <R> R accept(ASTVisitor<R> visitor) {
        return visitor.visitCssDeclaration(this);
    }
}
