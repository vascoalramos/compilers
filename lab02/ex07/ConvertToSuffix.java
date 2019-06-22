import java.util.Iterator;

public class ConvertToSuffix extends CalculatorBaseVisitor<String> {
    @Override
    public String visitProgram(CalculatorParser.ProgramContext ctx) {
        String str = "";
        Iterator<CalculatorParser.StatContext> iter = ctx.stat().iterator();
        while (iter.hasNext()) {
            str += visit(iter.next()) + "\n";
        }
        return str;
    }

    @Override
    public String visitExprStat(CalculatorParser.ExprStatContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public String visitAssignmentStat(CalculatorParser.AssignmentStatContext ctx) {
        return visit(ctx.assignment());
    }

    @Override
    public String visitSumSub(CalculatorParser.SumSubContext ctx) {
        return visit(ctx.e1) + " " + visit(ctx.e2) + " " + ctx.op.getText();
    }

    @Override
    public String visitParenthesis(CalculatorParser.ParenthesisContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public String visitVariable(CalculatorParser.VariableContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitNumber(CalculatorParser.NumberContext ctx) {
        return ctx.INT().getText();
    }

    @Override
    public String visitMultDiv(CalculatorParser.MultDivContext ctx) {
        return visit(ctx.e1) + " " + visit(ctx.e2) + " " + ctx.op.getText();
    }

    @Override
    public String visitAssignment(CalculatorParser.AssignmentContext ctx) {
        return ctx.ID().getText() + " " + visit(ctx.expr()) + " =";
    }

}