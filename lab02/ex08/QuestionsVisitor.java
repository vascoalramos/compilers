import java.util.*;

public class QuestionsVisitor extends QuestionDBBaseVisitor<String> {
    private Map<String, String> questions = new HashMap<>();
    private Map<String, List<String>> options = new HashMap<>();

    @Override
    public String visitQuestion(QuestionDBParser.QuestionContext ctx) {
        questions.put(ctx.ID().getText().replace("\"", ""), ctx.STRING().getText().replace("\"", ""));

        List<String> opts = new ArrayList<>();
        Iterator<QuestionDBParser.OptionContext> iter = ctx.option().iterator();
        while (iter.hasNext()) {
            opts.add(visit(iter.next()).replace("\"", ""));
        }
        options.put(ctx.ID().getText().replace("\"", ""), opts);
        return null;
    }

    @Override
    public String visitOption(QuestionDBParser.OptionContext ctx) {
        return ctx.STRING().getText();
    }

    public void printQuestion(String question, int nOptions) {
        Random rand = new Random();
        String header = questions.get(question);
        String printStr = "- " + header;
        List<String> temp = options.get(question);
        int r = rand.nextInt(temp.size());
        int op = 97;
        for (int i = 0; i < nOptions; i++) {
            printStr += "\n   " + (char)op + ") " + temp.get(r) + ";";
            r = rand.nextInt(temp.size());
            op++;
        }
        System.out.println(printStr);
    }

}