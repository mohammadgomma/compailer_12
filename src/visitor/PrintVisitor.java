package visitor;

import ast.*;

public class PrintVisitor implements ASTVisitor<String> {
    private int indentLevel = 0;

    private String indent() {
        return "  ".repeat(indentLevel);
    }

    @Override
    public String visitDocumentNode(DocumentNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Document [Line: %d, Column: %d]:\n", node.getLine(), node.getColumn()));

        if (node.getPythonProgram() != null) {
            indentLevel++;
            sb.append(indent()).append("Python Program:\n");
            indentLevel++;
            sb.append(node.getPythonProgram().accept(this));
            indentLevel -= 2;
        }

        indentLevel++;
        for (ElementNode element : node.getElements()) {
            sb.append(element.accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visitHtmlElementNode(HtmlElementNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent()).append("HTML Element: ").append(node.getTagName());

        if (node.isDoctype()) {
            sb.append(" (DOCTYPE)");
        }
        if (node.isSelfClosing()) {
            sb.append(" (self-closing)");
        }
        sb.append("\n");

        if (!node.getAttributes().isEmpty()) {
            indentLevel++;
            for (AttributeNode attr : node.getAttributes()) {
                sb.append(attr.accept(this));
            }
            indentLevel--;
        }

        if (!node.getChildren().isEmpty()) {
            indentLevel++;
            for (ElementNode child : node.getChildren()) {
                sb.append(child.accept(this));
            }
            indentLevel--;
        }

        return sb.toString();
    }

    @Override
    public String visitTextNode(TextNode node) {
        return indent() + "Text: \"" + node.getContent() + "\"\n";
    }

    @Override
    public String visitAttributeNode(AttributeNode node) {
        return indent() + "Attribute: " + node.getName() + "=\"" + node.getValue() + "\"\n";
    }

    @Override
    public String visitJinjaExpressionNode(JinjaExpressionNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent()).append("Jinja Expression: ").append(node.getExpression()).append("\n");

        if (!node.getFilters().isEmpty()) {
            indentLevel++;
            for (JinjaFilterNode filter : node.getFilters()) {
                sb.append(filter.accept(this));
            }
            indentLevel--;
        }

        return sb.toString();
    }

    @Override
    public String visitJinjaFilterNode(JinjaFilterNode node) {
        return indent() + "Filter: " + node.getFilterName() +
                (node.getArguments().isEmpty() ? "" : " args: " + node.getArguments()) + "\n";
    }

    @Override
    public String visitJinjaIfBlockNode(JinjaIfBlockNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent()).append("Jinja If Block: ").append(node.getCondition()).append("\n");

        indentLevel++;
        sb.append(indent()).append("Then:\n");
        indentLevel++;
        for (ElementNode element : node.getThenBody()) {
            sb.append(element.accept(this));
        }
        indentLevel--;

        for (JinjaElifBlockNode elif : node.getElifBlocks()) {
            sb.append(elif.accept(this));
        }

        if (node.getElseBody() != null && !node.getElseBody().isEmpty()) {
            sb.append(indent()).append("Else:\n");
            indentLevel++;
            for (ElementNode element : node.getElseBody()) {
                sb.append(element.accept(this));
            }
            indentLevel--;
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visitJinjaElifBlockNode(JinjaElifBlockNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent()).append("Elif: ").append(node.getCondition()).append("\n");

        indentLevel++;
        for (ElementNode element : node.getBody()) {
            sb.append(element.accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visitJinjaForBlockNode(JinjaForBlockNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent()).append("Jinja For Block: ")
                .append(node.getVariable()).append(" in ").append(node.getIterable()).append("\n");

        indentLevel++;
        for (ElementNode element : node.getBody()) {
            sb.append(element.accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visitJinjaSetBlockNode(JinjaSetBlockNode node) {
        return indent() + "Jinja Set: " + node.getVariable() + " = " + node.getValue() + "\n";
    }

    @Override
    public String visitPythonProgramNode(PythonProgramNode node) {
        StringBuilder sb = new StringBuilder();
        for (StatementNode stmt : node.getStatements()) {
            sb.append(stmt.accept(this));
        }
        return sb.toString();
    }

    @Override
    public String visitImportStatementNode(ImportStatementNode node) {
        String prefix = node.isFromImport() ? "from " + node.getModule() + " import " : "import ";
        return indent() + "Import: " + prefix + node.getImports() + "\n";
    }

    @Override
    public String visitImportAliasNode(ImportAliasNode node) {
        return node.getName() + (node.getAlias() != null ? " as " + node.getAlias() : "");
    }

    @Override
    public String visitAssignmentNode(AssignmentNode node) {
        return indent() + "Assignment: " + node.getVariable() + " = " +
                (node.getValue() != null ? node.getValue().accept(this) : "null") + "\n";
    }

    @Override
    public String visitFunctionDefNode(FunctionDefNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent()).append(String.format("Function: %s [Line: %d, Column: %d]\n",
                node.getName(), node.getLine(), node.getColumn()));

        if (!node.getDecorators().isEmpty()) {
            indentLevel++;
            for (DecoratorNode decorator : node.getDecorators()) {
                sb.append(decorator.accept(this));
            }
            indentLevel--;
        }

        sb.append(indent()).append("Parameters: ");
        for (ParameterNode param : node.getParameters()) {
            sb.append(param.accept(this)).append(" ");
        }
        sb.append("\n");

        indentLevel++;
        for (StatementNode stmt : node.getBody()) {
            sb.append(stmt.accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visitCssRule(CssRuleNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent()).append("CSS Rule: ").append(node.getSelectors()).append("\n");

        indentLevel++;
        for (CssDeclarationNode decl : node.getDeclarations()) {
            sb.append(decl.accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visitCssDeclaration(CssDeclarationNode node) {
        return indent() + "Declaration: " + node.getProperty() + ": " + node.getValue() + "\n";
    }

    @Override
    public String visitStyleElement(StyleElementNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent()).append("Style Element\n");

        if (!node.getAttributes().isEmpty()) {
            indentLevel++;
            for (AttributeNode attr : node.getAttributes()) {
                sb.append(attr.accept(this));
            }
            indentLevel--;
        }

        if (!node.getCssRules().isEmpty()) {
            indentLevel++;
            for (CssRuleNode rule : node.getCssRules()) {
                sb.append(rule.accept(this));
            }
            indentLevel--;
        }

        return sb.toString();
    }

    @Override
    public String visitParameterNode(ParameterNode node) {
        return node.getName() + (node.getDefaultValue() != null ? "=" + node.getDefaultValue().accept(this) : "");
    }

    @Override
    public String visitDecoratorNode(DecoratorNode node) {
        return indent() + "Decorator: @" + node.getName() + "\n";
    }

    @Override
    public String visitIfStatementNode(IfStatementNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent()).append("If Statement [Line: ").append(node.getLine()).append("]:\n");

        indentLevel++;
        sb.append(indent()).append("Condition: ").append(node.getCondition()).append("\n");
        sb.append(indent()).append("Then:\n");
        indentLevel++;
        for (StatementNode stmt : node.getThenBody()) {
            sb.append(stmt.accept(this));
        }
        indentLevel--;

        for (ElifNode elif : node.getElifBlocks()) {
            sb.append(elif.accept(this));
        }

        if (node.getElseBody() != null && !node.getElseBody().isEmpty()) {
            sb.append(indent()).append("Else:\n");
            indentLevel++;
            for (StatementNode stmt : node.getElseBody()) {
                sb.append(stmt.accept(this));
            }
            indentLevel--;
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visitElifNode(ElifNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent()).append("Elif: ").append(node.getCondition()).append("\n");

        indentLevel++;
        for (StatementNode stmt : node.getBody()) {
            sb.append(stmt.accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visitReturnStatementNode(ReturnStatementNode node) {
        return indent() + "Return: " + (node.getValue() != null ? node.getValue().accept(this) : "") + "\n";
    }

    @Override
    public String visitExpressionStatementNode(ExpressionStatementNode node) {
        return indent() + "Expression: " + (node.getExpression() != null ? node.getExpression().accept(this) : "")
                + "\n";
    }

    @Override
    public String visitLiteralNode(LiteralNode node) {
        return node.getValue().toString();
    }

    @Override
    public String visitVariableNode(VariableNode node) {
        return node.getName();
    }

    @Override
    public String visitBinaryOpNode(BinaryOpNode node) {
        return (node.getLeft() != null ? node.getLeft().accept(this) : "") +
                " " + node.getOperator() + " " +
                (node.getRight() != null ? node.getRight().accept(this) : "");
    }

    @Override
    public String visitFunctionCallNode(FunctionCallNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(node.getFunctionName()).append("(");

        for (int i = 0; i < node.getArguments().size(); i++) {
            if (i > 0)
                sb.append(", ");
            sb.append(node.getArguments().get(i).accept(this));
        }

        for (KeywordArgumentNode kwarg : node.getKeywordArguments()) {
            if (sb.length() > node.getFunctionName().length() + 1)
                sb.append(", ");
            sb.append(kwarg.accept(this));
        }

        sb.append(")");
        return sb.toString();
    }

    @Override
    public String visitKeywordArgumentNode(KeywordArgumentNode node) {
        return node.getName() + "=" + (node.getValue() != null ? node.getValue().accept(this) : "");
    }

    @Override
    public String visitListNode(ListNode node) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < node.getElements().size(); i++) {
            if (i > 0)
                sb.append(", ");
            sb.append(node.getElements().get(i).accept(this));
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public String visitDictNode(DictNode node) {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < node.getItems().size(); i++) {
            if (i > 0)
                sb.append(", ");
            sb.append(node.getItems().get(i).accept(this));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String visitDictItemNode(DictItemNode node) {
        return (node.getKey() != null ? node.getKey().accept(this) : "") +
                ": " + (node.getValue() != null ? node.getValue().accept(this) : "");
    }
}