package ast;

import java.util.List;

// Function Call
public class FunctionCallNode extends ExpressionNode {
    public List<ExpressionNode> arguments;
    public List<KeywordArgumentNode> keywordArguments;
    private final String functionName;

    public FunctionCallNode(int line, int column, String functionName,
                            List<ExpressionNode> arguments,
                            List<KeywordArgumentNode> keywordArguments) {
        super(line, column);
        this.functionName = functionName;
        this.arguments = arguments;
        this.keywordArguments = keywordArguments;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitFunctionCallNode(this);
    }

    public String getFunctionName() {
        return functionName;
    }

    public List<ExpressionNode> getArguments() {
        return arguments;
    }

    public List<KeywordArgumentNode> getKeywordArguments() {
        return keywordArguments;
    }
}
