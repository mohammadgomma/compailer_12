package ast;

import java.util.List;

// Jinja Elif Block
public class JinjaElifBlockNode extends ASTNode {
    public List<ElementNode> body;
    private final String condition;

    public JinjaElifBlockNode(int line, int column, String condition, List<ElementNode> body) {
        super(line, column);
        this.condition = condition;
        this.body = body;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitJinjaElifBlockNode(this);
    }

    public String getCondition() {
        return condition;
    }

    public List<ElementNode> getBody() {
        return body;
    }
}
