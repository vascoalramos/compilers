// Generated from Hello.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(HelloParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(HelloParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#greetings}.
	 * @param ctx the parse tree
	 */
	void enterGreetings(HelloParser.GreetingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#greetings}.
	 * @param ctx the parse tree
	 */
	void exitGreetings(HelloParser.GreetingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#farewell}.
	 * @param ctx the parse tree
	 */
	void enterFarewell(HelloParser.FarewellContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#farewell}.
	 * @param ctx the parse tree
	 */
	void exitFarewell(HelloParser.FarewellContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#names}.
	 * @param ctx the parse tree
	 */
	void enterNames(HelloParser.NamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#names}.
	 * @param ctx the parse tree
	 */
	void exitNames(HelloParser.NamesContext ctx);
}