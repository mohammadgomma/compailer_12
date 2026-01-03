import ANT.*;
import ast.*;
import org.antlr.v4.runtime.*;
import parseTree.ASTBuilder;
import symboltable.SymbolTable;
import visitor.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        System.out.println("================");
        System.out.println("Flask/Jinja2 Compiler - Group Project");
        System.out.println("================");

        String[] testPrograms = {
                "C:\\Users\\LENOVO\\IdeaProjects\\cmpailer_pro-master2\\cmpailer_pro-master2\\src\\test_programs\\test1_app.py",
                "C:\\Users\\LENOVO\\IdeaProjects\\cmpailer_pro-master2\\cmpailer_pro-master2\\src\\test_programs\\test1_products.html",
                "C:\\Users\\LENOVO\\IdeaProjects\\cmpailer_pro-master2\\cmpailer_pro-master2\\src\\test_programs\\test2_add_product.html",
                "C:\\Users\\LENOVO\\IdeaProjects\\cmpailer_pro-master2\\cmpailer_pro-master2\\src\\test_programs\\test3_product_details.html",
                "C:\\Users\\LENOVO\\IdeaProjects\\cmpailer_pro-master2\\cmpailer_pro-master2\\src\\test_programs\\test4_css.html"
        };

        for (String testFile : testPrograms) {
            processFile(testFile);
        }

        System.out.println("\n" + "================");
        System.out.println("Compilation Complete!");
        System.out.println("=============");
    }

    private static void processFile(String filename) {
        System.out.println("\n" + "==============");
        System.out.println("Processing: " + filename);
        System.out.println("===================");

        try {
            String content = readFile(filename);

            // Create lexer and parser
            CharStream input = CharStreams.fromString(content);
            HtmlLexer lexer = new HtmlLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            HtmlParser parser = new HtmlParser(tokens);

            // Parse the input
            HtmlParser.StartContext tree = parser.start();

            // Build AST
            ASTBuilder astBuilder = new ASTBuilder();
            DocumentNode documentNode = (DocumentNode) astBuilder.visit(tree);

            // Print AST
            System.out.println("\n" + "---------------------------");
            System.out.println("ABSTRACT SYNTAX TREE (AST)");
            System.out.println("------------------------------");
            PrintVisitor printVisitor = new PrintVisitor();
            String astOutput = documentNode.accept(printVisitor);
            System.out.println(astOutput);

            // Build Symbol Table
            SymbolTable symbolTable = new SymbolTable();
            SymbolTableVisitor symbolTableVisitor = new SymbolTableVisitor(symbolTable);
            documentNode.accept(symbolTableVisitor);

            // Print Symbol Table
            symbolTable.printSymbolTable();

        } catch (IOException e) {
            System.err.println("Error reading file: " + filename);
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Error processing file: " + filename);
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static String readFile(String filename) throws IOException {
        java.nio.file.Path path = Paths.get(filename);
        if (!Files.exists(path)) {
            // Try relative to src if not found
            if (!filename.startsWith("src/")) {
                path = Paths.get("src", filename);
            }
        }
        return new String(Files.readAllBytes(path), StandardCharsets.UTF_8);
    }
}
