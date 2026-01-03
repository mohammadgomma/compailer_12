package ast;

import java.util.List;

// Jinja For Block
public class JinjaForBlockNode extends ElementNode {
    public List<ElementNode> body;
    private final String variable;
    private final String iterable;

    public JinjaForBlockNode(int line, int column, String variable, String iterable, List<ElementNode> body) {
        super(line, column);
        this.variable = variable;
        this.iterable = iterable;
        this.body = body;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitJinjaForBlockNode(this);
    }

    public String getVariable() {
        return variable;
    }

    public String getIterable() {
        return iterable;
    }

    public List<ElementNode> getBody() {
        return body;
    }
}
