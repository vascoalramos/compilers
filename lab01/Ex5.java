package P01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// import static java.lang.System.*;

public class Ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = "";
        double result = 0, op1 = 0, op2 = 0;
        Map<String, Double> variables = new HashMap<String, Double>();

        while(true) {
            line = sc.nextLine();
            String[] tokens = line.split("\\s");
            if (line.contains("=") & !tokens[0].chars().allMatch(Character::isDigit)) {

                variables.put(tokens[0],Double.parseDouble(tokens[2]));
            }
            System.out.println("result = " + result);

        }
        /*for(int i = 0; i < 3; i++) {
            if (i == 0 & sc.hasNextDouble()) {
                op1 = sc.nextDouble();
            }
            else if (i == 1 & sc.hasNext()) {
                operator = sc.next();
            }
            else if (i == 2 & sc.hasNextDouble()) {
                op2 = sc.nextDouble();
            }
            else {
                System.err.println("Error: read number failure");
                System.exit(1);
            }
        }*/
        /*switch (operator) {
            case "+":
                result = op1 + op2;
                System.out.println(op1 + " + " + op2 + " = " + result);
                break;
            case "-":
                result = op1 - op2;
                System.out.printf(op1 + " - " + op2 + " = " + result);
                break;
            case "*":
                result = op1 * op2;
                System.out.printf(op1 + " * " + op2 + " = " + result);
                break;
            case "/":
                result = op1 / op2;
                System.out.printf(op1 + " / " + op2 + " = " + result);
                break;
            default:
                System.err.printf("ERROR: invalid operator \"%s\"",operator);
                System.exit(1);
                break;
        }*/

    }
}
