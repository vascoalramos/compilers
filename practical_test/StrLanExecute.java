import java.util.*;

public class StrLanExecute extends StrLanBaseVisitor<String> {

    private Map<String,String> symbolTable = new HashMap<>();
    
	@Override
    public String visitMain(StrLanParser.MainContext ctx) {
        
        String res = "";
        Iterator<StrLanParser.StatContext> iter = ctx.stat().iterator();
        while (iter.hasNext()) {
            String resLocal = visit(iter.next());
            if (resLocal != null)
            res += resLocal + "\n";
        }

        return res;
    }

	@Override
    public String visitPrint(StrLanParser.PrintContext ctx) {
        String res = visit(ctx.expr());
        return res;
    }

    @Override
    public String visitExprVar(StrLanParser.ExprVarContext ctx) {
        String var = ctx.ID().getText();
        if (!symbolTable.containsKey(var)) {
            System.out.println("ERROR: variable is not defined!");
            System.exit(1);
        }

        return symbolTable.get(var);

    }


	@Override
    public String visitAssignment(StrLanParser.AssignmentContext ctx) {
        String varName = ctx.ID().getText().replace("\"","");
        String content = visit(ctx.expr());
        
        symbolTable.put(varName, content);
        return null;
    }

	@Override
    public String visitExprConcat(StrLanParser.ExprConcatContext ctx) {
        return visit(ctx.e1) + visit(ctx.e2);
    }

	@Override
    public String visitExprInput(StrLanParser.ExprInputContext ctx) {
        Scanner sc = new Scanner(System.in);
        System.out.print(visit(ctx.expr()));
        String input = sc.nextLine();
        return input;
    }

	@Override
    public String visitExprRepl(StrLanParser.ExprReplContext ctx) {
        return visit(ctx.e1).replace(visit(ctx.e2),visit(ctx.e3));
    }

	@Override
    public String visitExprStr(StrLanParser.ExprStrContext ctx) {
        return ctx.STRING().getText().replace("\"","");
    }
}