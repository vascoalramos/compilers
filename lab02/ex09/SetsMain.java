import java.util.Scanner;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class SetsMain {
   public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      String lineText = null;
      int lineNum = 1;
      if (sc.hasNextLine())
         lineText = sc.nextLine();
      SetsParser parser = new SetsParser(null);
      // replace error listener:
      //parser.removeErrorListeners(); // remove ConsoleErrorListener
      //parser.addErrorListener(new ErrorHandlingListener());
      Compute visitor0 = new Compute();
      while(lineText != null) {
         // create a CharStream that reads from standard input:
         CharStream input = CharStreams.fromString(lineText + "\n");
         // create a lexer that feeds off of input CharStream:
         SetsLexer lexer = new SetsLexer(input);
         lexer.setLine(lineNum);
         lexer.setCharPositionInLine(0);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         parser.setInputStream(tokens);
         // begin parsing at main rule:
         ParseTree tree = parser.main();
         if (parser.getNumberOfSyntaxErrors() == 0) {
            // print LISP-style tree:
            // System.out.println(tree.toStringTree(parser));
            System.out.println(lineText);
            System.out.printf("Result: " + visitor0.visit(tree));
            System.out.println();
         }
         if (sc.hasNextLine())
            lineText = sc.nextLine();
         else
            lineText = null;
         lineNum++;
      }
   }
}
