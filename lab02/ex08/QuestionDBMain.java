import java.io.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class QuestionDBMain {
   public static void main(String[] args) throws Exception {
      if (args.length != 3) {
         System.err.println("ERROR: invalid input\nExample: java QuestionDBMain <file_with_questions> <question_name> <no_of_questions>");
         System.exit(1);
      }

      InputStream in_stream = null;
      try {
         in_stream = new FileInputStream(new File(args[0]));
      } catch (Exception e) {
         System.err.println("ERROR: reading file!");
         System.exit(1);
      }
      // create a CharStream that reads from standard input:
      CharStream input = CharStreams.fromStream(in_stream);
      // create a lexer that feeds off of input CharStream:
      QuestionDBLexer lexer = new QuestionDBLexer(input);
      // create a buffer of tokens pulled from the lexer:
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      // create a parser that feeds off the tokens buffer:
      QuestionDBParser parser = new QuestionDBParser(tokens);
      // replace error listener:
      // parser.removeErrorListeners(); // remove ConsoleErrorListener
      // parser.addErrorListener(new ErrorHandlingListener());
      // begin parsing at program rule:
      ParseTree tree = parser.program();
      if (parser.getNumberOfSyntaxErrors() == 0) {
         // print LISP-style tree:
         // System.out.println(tree.toStringTree(parser));
         QuestionsVisitor visitor0 = new QuestionsVisitor();
         visitor0.visit(tree);

         visitor0.printQuestion(args[1], Integer.parseInt(args[2]));
      }
   }
}
