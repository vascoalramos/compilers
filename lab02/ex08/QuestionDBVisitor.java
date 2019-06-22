// Generated from QuestionDB.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QuestionDBParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QuestionDBVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QuestionDBParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(QuestionDBParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionDBParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(QuestionDBParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionDBParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption(QuestionDBParser.OptionContext ctx);
}