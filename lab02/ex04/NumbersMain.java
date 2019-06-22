import java.io.*;
import java.util.Scanner;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class NumbersMain {
   public static void main(String[] args) throws Exception {
      InputStream in_stream = null;
      try {
         in_stream = new FileInputStream(new File("numbers.txt"));
      } catch (FileNotFoundException e) {
         System.err.println("ERROR: reading number file!");
         System.exit(1);
      } // create a CharStream that reads from in_stream:
      CharStream input = CharStreams.fromStream(in_stream);
      // create a lexer that feeds off of input CharStream:
      NumbersLexer lexer = new NumbersLexer(input);
      // create a buffer of tokens pulled from the lexer:
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      // create a parser that feeds off the tokens buffer:
      NumbersParser parser = new NumbersParser(tokens);
      // replace error listener:
      // parser.removeErrorListeners(); // remove ConsoleErrorListener
      // parser.addErrorListener(new ErrorHandlingListener());
      // begin parsing at file rule:
      ParseTree tree = parser.file();
      if (parser.getNumberOfSyntaxErrors() == 0) {
         // print LISP-style tree:
         // System.out.println(tree.toStringTree(parser));
         ParseTreeWalker walker = new ParseTreeWalker();
         NumbersMappings mappings = new NumbersMappings();
         walker.walk(mappings, tree);

         Scanner sc = new Scanner(System.in);
         while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] words = line.replace("-", " ").toLowerCase().split(" ");
            for (String w : words) {
               if (mappings.exists(w))
                  System.out.print(mappings.value(w).toString());
               else
                  System.out.print(w);
               System.out.print(" ");
            }
            System.out.println();
         }
      }
   }
}
