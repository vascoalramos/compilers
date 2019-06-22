// Generated from Sets.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SetsParser}.
 */
public interface SetsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SetsParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(SetsParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetsParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(SetsParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprVar}
	 * labeled alternative in {@link SetsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprVar(SetsParser.ExprVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprVar}
	 * labeled alternative in {@link SetsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprVar(SetsParser.ExprVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link SetsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(SetsParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link SetsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(SetsParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprIntercept}
	 * labeled alternative in {@link SetsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprIntercept(SetsParser.ExprInterceptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprIntercept}
	 * labeled alternative in {@link SetsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprIntercept(SetsParser.ExprInterceptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSubtract}
	 * labeled alternative in {@link SetsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSubtract(SetsParser.ExprSubtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSubtract}
	 * labeled alternative in {@link SetsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSubtract(SetsParser.ExprSubtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprUnion}
	 * labeled alternative in {@link SetsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprUnion(SetsParser.ExprUnionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprUnion}
	 * labeled alternative in {@link SetsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprUnion(SetsParser.ExprUnionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAssignment}
	 * labeled alternative in {@link SetsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAssignment(SetsParser.ExprAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAssignment}
	 * labeled alternative in {@link SetsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAssignment(SetsParser.ExprAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSet}
	 * labeled alternative in {@link SetsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSet(SetsParser.ExprSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSet}
	 * labeled alternative in {@link SetsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSet(SetsParser.ExprSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetsParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(SetsParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetsParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(SetsParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetsParser#elem}.
	 * @param ctx the parse tree
	 */
	void enterElem(SetsParser.ElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetsParser#elem}.
	 * @param ctx the parse tree
	 */
	void exitElem(SetsParser.ElemContext ctx);
}