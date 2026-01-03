package ast;

import java.util.List;

// Dict Expression
public class DictNode extends ExpressionNode {
    public List<DictItemNode> items;

    public DictNode(int line, int column, List<DictItemNode> items) {
        super(line, column);
        this.items = items;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitDictNode(this);
    }

    public List<DictItemNode> getItems() {
        return items;
    }
}
