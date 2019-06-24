// Generated from StrLan.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StrLanParser}.
 */
public interface StrLanListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StrLanParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(StrLanParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrLanParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(StrLanParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrLanParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(StrLanParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrLanParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(StrLanParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrLanParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(StrLanParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrLanParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(StrLanParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrLanParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(StrLanParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrLanParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(StrLanParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprVar}
	 * labeled alternative in {@link StrLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprVar(StrLanParser.ExprVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprVar}
	 * labeled alternative in {@link StrLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprVar(StrLanParser.ExprVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprConcat}
	 * labeled alternative in {@link StrLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprConcat(StrLanParser.ExprConcatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprConcat}
	 * labeled alternative in {@link StrLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprConcat(StrLanParser.ExprConcatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInput}
	 * labeled alternative in {@link StrLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInput(StrLanParser.ExprInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInput}
	 * labeled alternative in {@link StrLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInput(StrLanParser.ExprInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprRepl}
	 * labeled alternative in {@link StrLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprRepl(StrLanParser.ExprReplContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprRepl}
	 * labeled alternative in {@link StrLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprRepl(StrLanParser.ExprReplContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStr}
	 * labeled alternative in {@link StrLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprStr(StrLanParser.ExprStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStr}
	 * labeled alternative in {@link StrLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprStr(StrLanParser.ExprStrContext ctx);
}