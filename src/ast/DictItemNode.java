package ast;

// Dict Item
public class DictItemNode extends ASTNode {
    private final ExpressionNode key;
    private final ExpressionNode value;

    public DictItemNode(int line, int column, ExpressionNode key, ExpressionNode value) {
        super(line, column);
        this.key = key;
        this.value = value;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitDictItemNode(this);
    }

    public ExpressionNode getKey() {
        return key;
    }

    public ExpressionNode getValue() {
        return value;
    }
}
