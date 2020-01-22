public class ExtractInfo extends Java8BaseListener {
    @Override
    public void enterNormalClassDeclaration(Java8Parser.NormalClassDeclarationContext ctx) {
        System.out.println("Class " + ctx.Identifier().getText());
    }

    @Override
    public void enterMethodDeclarator(Java8Parser.MethodDeclaratorContext ctx) {
        System.out.println("Method " + ctx.Identifier().getText());
    }
}