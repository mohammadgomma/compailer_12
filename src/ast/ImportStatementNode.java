package ast;

import java.util.List;

// Import Statement
public class ImportStatementNode extends StatementNode {
    public List<ImportAliasNode> imports;
    private final String module;
    private final boolean isFromImport;

    public ImportStatementNode(int line, int column, String module,
                               List<ImportAliasNode> imports, boolean isFromImport) {
        super(line, column);
        this.module = module;
        this.imports = imports;
        this.isFromImport = isFromImport;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitImportStatementNode(this);
    }

    public String getModule() {
        return module;
    }

    public List<ImportAliasNode> getImports() {
        return imports;
    }

    public boolean isFromImport() {
        return isFromImport;
    }
}
