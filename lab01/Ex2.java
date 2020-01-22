package P01;

import java.util.Scanner;
import java.util.Stack;

public class Ex2 {

    public static void main(String[] args) {
        Stack<Double> numberStack = new Stack<>();
        Scanner scInput = new Scanner(System.in);
        String input = scInput.nextLine();
        Scanner scString = new Scanner(input);
        double op1 = 0, op2 = 0, result = 0;
        String operator = "";
        while (scString.hasNextDouble()) {
            numberStack.push(scString.nextDouble());
            System.out.println("Stack: " + numberStack);
        }
        while (scString.hasNext() & numberStack.size() > 1 ) {
            op1 = numberStack.pop();
            op2 = numberStack.pop();
            operator = scString.next();
            switch (operator) {
                case "+":
                    result = op1 + op2;
                    break;
                case "-":
                    result = op1 - op2;
                    break;
                case "*":
                    result = op1 * op2;
                    break;
                case "/":
                    result = op1 / op2;
                    break;
                default:
                    System.err.printf("ERROR: invalid operator \"%s\"\n",operator);
                    System.exit(1);
                    break;
            }
            numberStack.push(result);
            System.out.println("Stack: " + numberStack);
        }
    }
}
