package ast;

// Keyword Argument
public class KeywordArgumentNode extends ASTNode {
    private final String name;
    private final ExpressionNode value;

    public KeywordArgumentNode(int line, int column, String name, ExpressionNode value) {
        super(line, column);
        this.name = name;
        this.value = value;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitKeywordArgumentNode(this);
    }

    public String getName() {
        return name;
    }

    public ExpressionNode getValue() {
        return value;
    }
}
