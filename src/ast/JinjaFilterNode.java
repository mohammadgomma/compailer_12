package ast;

import java.util.List;

// Jinja Filter
public class JinjaFilterNode extends ASTNode {
    private final String filterName;
    private final List<String> arguments;

    public JinjaFilterNode(int line, int column, String filterName, List<String> arguments) {
        super(line, column);
        this.filterName = filterName;
        this.arguments = arguments;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitJinjaFilterNode(this);
    }

    public String getFilterName() {
        return filterName;
    }

    public List<String> getArguments() {
        return arguments;
    }
}
