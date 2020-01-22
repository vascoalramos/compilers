// Generated from CalComplex.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalComplexParser}.
 */
public interface CalComplexListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalComplexParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(CalComplexParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalComplexParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(CalComplexParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalComplexParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(CalComplexParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalComplexParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(CalComplexParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalComplexParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(CalComplexParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalComplexParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(CalComplexParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalComplexParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CalComplexParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalComplexParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CalComplexParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalComplexParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CalComplexParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalComplexParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CalComplexParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalComplexParser#complex}.
	 * @param ctx the parse tree
	 */
	void enterComplex(CalComplexParser.ComplexContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalComplexParser#complex}.
	 * @param ctx the parse tree
	 */
	void exitComplex(CalComplexParser.ComplexContext ctx);
}