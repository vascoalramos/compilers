import java.util.*;

public class Compute extends SetsBaseVisitor<String> {

    private Map<String, Set<String>> vars = new HashMap<>();

    @Override
    public String visitMain(SetsParser.MainContext ctx) {
        String str = "";
        Iterator<SetsParser.ExprContext> iter = ctx.expr().iterator();
        while (iter.hasNext()) {
            str += visit(iter.next()) + "\n";
        }
        return str;
    }

    @Override
    public String visitExprVar(SetsParser.ExprVarContext ctx) {
        if (!vars.containsKey(ctx.VAR().getText())) {
            System.err.println("ERROR: variable is not defined!");
            System.exit(1);
        }
        return setToStr(vars.get(ctx.VAR().getText()));

    }

    @Override
    public String visitExprAssignment(SetsParser.ExprAssignmentContext ctx) {
        vars.put(ctx.VAR().getText(), strToSet(visit(ctx.e)));
        return setToStr(vars.get(ctx.VAR().getText()));
    }

    @Override
    public String visitParenthesis(SetsParser.ParenthesisContext ctx) {
        return visit(ctx.e);
    }

    @Override
    public String visitExprIntercept(SetsParser.ExprInterceptContext ctx) {
        Set<String> set1 = strToSet(visit(ctx.e1));
        Set<String> set2 = strToSet(visit(ctx.e2));
        set1.retainAll(set2);
        return setToStr(set1);
    }

    @Override
    public String visitExprSubtract(SetsParser.ExprSubtractContext ctx) {
        Set<String> set1 = strToSet(visit(ctx.e1));
        Set<String> set2 = strToSet(visit(ctx.e2));
        set1.removeAll(set2);
        return setToStr(set1);
    }

    @Override
    public String visitExprUnion(SetsParser.ExprUnionContext ctx) {
        Set<String> set1 = strToSet(visit(ctx.e1));
        Set<String> set2 = strToSet(visit(ctx.e2));
        set1.addAll(set2);
        return setToStr(set1);
    }

    @Override
    public String visitSet(SetsParser.SetContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitElem(SetsParser.ElemContext ctx) {
        return ctx.getText();
    }

    private String setToStr(Set<String> set) {
        List<String> mainList = new ArrayList<String>();
        mainList.addAll(set);
        String str = "{";
        for (int i = 0; i < mainList.size(); i++) {
            if (i != 0)
                str += "," + mainList.get(i);
            else
                str += mainList.get(i);
        }
        return str + "}";
    }

    private Set<String> strToSet(String str) {
        Set<String> set = new HashSet<>();
        for (String s : str.replace("{", "").replace("}", "").split(",")) {
            set.add(s);
        }
        return set;
    }

}