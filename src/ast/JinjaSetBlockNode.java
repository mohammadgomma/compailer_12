package ast;

// Jinja Set Block
public class JinjaSetBlockNode extends ElementNode {
    private final String variable;
    private final String value;

    public JinjaSetBlockNode(int line, int column, String variable, String value) {
        super(line, column);
        this.variable = variable;
        this.value = value;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitJinjaSetBlockNode(this);
    }

    public String getVariable() {
        return variable;
    }

    public String getValue() {
        return value;
    }
}
