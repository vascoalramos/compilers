// Generated from Sets.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SetsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SetsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SetsParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(SetsParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprVar}
	 * labeled alternative in {@link SetsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVar(SetsParser.ExprVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link SetsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(SetsParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprIntercept}
	 * labeled alternative in {@link SetsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIntercept(SetsParser.ExprInterceptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSubtract}
	 * labeled alternative in {@link SetsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSubtract(SetsParser.ExprSubtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprUnion}
	 * labeled alternative in {@link SetsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUnion(SetsParser.ExprUnionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAssignment}
	 * labeled alternative in {@link SetsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAssignment(SetsParser.ExprAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSet}
	 * labeled alternative in {@link SetsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSet(SetsParser.ExprSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetsParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(SetsParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetsParser#elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElem(SetsParser.ElemContext ctx);
}