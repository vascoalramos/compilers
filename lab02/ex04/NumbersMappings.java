import java.util.HashMap;
import java.util.Map;

public class NumbersMappings extends NumbersBaseListener {

    private Map<String, Integer> mappings = new HashMap<>();

    public boolean exists(String w) {
        return mappings.containsKey(w);
    }

    public Integer value(String key) {
        return mappings.get(key);
    }

    @Override
    public void exitLine(NumbersParser.LineContext ctx) {
        String word = ctx.WORD().getText();
        Integer value = Integer.parseInt(ctx.NUM().getText());

        if (exists(word)) {
            System.err.println("ERROR: \"" + word + "\" key already exists!");
            System.exit(1);
        }

        mappings.put(word, value);
    }

}