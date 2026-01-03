package ast;

import java.util.List;

// List Expression
public class ListNode extends ExpressionNode {
    public List<ExpressionNode> elements;

    public ListNode(int line, int column, List<ExpressionNode> elements) {
        super(line, column);
        this.elements = elements;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitListNode(this);
    }

    public List<ExpressionNode> getElements() {
        return elements;
    }
}
