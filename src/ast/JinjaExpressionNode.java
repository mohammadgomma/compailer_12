package ast;

import java.util.List;

// Jinja Expression
public class JinjaExpressionNode extends ElementNode {
    public String expression;
    public List<JinjaFilterNode> filters;

    public JinjaExpressionNode(int line, int column, String expression, List<JinjaFilterNode> filters) {
        super(line, column);
        this.expression = expression;
        this.filters = filters;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitJinjaExpressionNode(this);
    }

    public String getExpression() {
        return expression;
    }

    public List<JinjaFilterNode> getFilters() {
        return filters;
    }
}

