package P01;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static P01.Ex3.loadContent;

public class Ex6 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Usage: java -ea b1_6 <dictionary-file> <input-file>");
            System.exit(1);
        }

        List contents = loadContent(args[0]);
        List textToTranslate = loadContent(args[1]);
        Map<String, String> ptToEng = new HashMap<>();
        for (Object line : contents) {
            StringBuilder string = new StringBuilder();
            String[] array = line.toString().replaceAll("[\\s]+", " ").split(" ");
            int i;
            for (i = 1; i < array.length - 1; i++)
                string.append(array[i]).append(" ");
            string.append(array[i]);
            ptToEng.put(line.toString().split(" ")[0], string.toString());
        }

        StringBuilder string = new StringBuilder();
        boolean changes;
        String translatedString = "";
        for (Object line : textToTranslate) {
            changes = translate((String) line, ptToEng, string);
            while (changes) {
                translatedString = string.toString();
                string.setLength(0);
                changes = translate(translatedString, ptToEng, string);
            }

            System.out.println("\"" + line + "\"" + " -> \"" + translatedString + "\"");
            translatedString = "";
            string.setLength(0);
        }

    }

    public static boolean translate(String textToTranslate, Map<String, String> ptToEng, StringBuilder string) {
        boolean change = false;
        int count = 0;
        for (String word : textToTranslate.split(" ")) {
            if (ptToEng.containsKey(word)) {
                string.append(ptToEng.get(word));
                change = true;
            } else
                string.append(word);
            if (count < textToTranslate.split(" ").length - 1)
                string.append(" ");
            count++;
        }
        return change;
    }
}
