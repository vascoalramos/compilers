package P01;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class Ex3 {

    public static void main(String[] args) {
        List contents = loadContent(args[0]);
        System.out.println(args[0]);

        Map<String, String> dict = createDict(contents);

        StringBuilder finalString = transformString(dict);

        System.out.println(finalString.toString());
    }

    public static Map createDict(List content) {
        Map<String, String> dict = new HashMap<>();
        for (Object line : content) {
            String[] elements = line.toString().replaceAll(" ", "").split("-");
            dict.put(elements[1], elements[0]);
        }
        return dict;
    }

    public static List loadContent(String pathStr) {
        Path path = Paths.get(pathStr);
        List contents = null;
        try {
            contents = Files.readAllLines(path);

        } catch (IOException ex) {
            ex.printStackTrace(); // handle exception here
        }
        return contents;
    }

    public static StringBuilder transformString(Map dict) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasNext()) {
            String[] words = sc.next().split("-");
            for (int i = 0; i < words.length; i++) {
                if (dict.containsKey(words[i])) {
                    sb.append(dict.get(words[i])).append(" ");
                } else if (!words[i].equals("")) {
                    sb.append(words[i]).append(" ");
                }
            }

        }
        return sb;
    }

}
