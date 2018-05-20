import gen.GrammarLexer;
import gen.GrammarParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {

            ANTLRInputStream input = new ANTLRFileStream("d://Projects/compiler-yapis-master/src/test/program.txt");
            GrammarLexer lexer = new GrammarLexer(input);
            GrammarParser parser = new GrammarParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.program();
            CompilerVisitor visitor = new CompilerVisitor();
            String output = (String) visitor.visit(tree);
            System.out.println(1);

            FileWriter fileWriter = new FileWriter("src/main/java/Program.java");
            fileWriter.write(output);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}