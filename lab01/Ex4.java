package P01;

import java.util.*;

import static P01.Ex3.*;

public class Ex4 {

    public static void main(String[] args) {
        List contents = loadContent("../../../numbers.txt");

        Map<String, String> dict = createDict(contents);

        transformStringAndPrint(dict);

    }

    public static void transformStringAndPrint(Map dict) {
        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int result = 0;
        StringBuilder sb = new StringBuilder();
        while (sc.hasNext()) {
            String[] words = sc.next().split("[-]+");
            for (int i = 0; i < words.length; i++) {
                if (dict.containsKey(words[i])) {
                    sb.append(words[i]).append(" ");
                    numbers.add(Integer.valueOf((String) dict.get(words[i])));
                } else if (words[i].equals("and")) {
                    continue;
                } else {
                    System.err.printf("ERROR: Number text %s does not exist in table!\n", words[i]);
                    System.exit(1);
                }
            }
        }

        Set<Integer> numbersToMultiply = new HashSet<>();
        for (int i = 0; i < numbers.size() - 1; i++) {
            numbersToMultiply.add(numbers.get(i));
            if (numbers.get(i + 1) > numbers.get(i)) {
                numbersToMultiply.add(numbers.get(i));
                numbersToMultiply.add(numbers.get(i + 1));
            } else {
                if (i == numbers.size() - 2)
                    result += numbers.get(i + 1);
                result += numbersToMultiply.stream().mapToInt(x -> x).reduce(1, Math::multiplyExact);
                numbersToMultiply.clear();
            }
        }
        if (numbersToMultiply.size() > 0)
            result += numbersToMultiply.stream().mapToInt(x -> x).reduce(1, Math::multiplyExact);
        System.out.println(sb.toString() + "-> " + result);
    }
}
