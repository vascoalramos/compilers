package P01;

import java.util.Scanner;
// import static java.lang.System.*;

public class Ex1 {

    public static void main(String[] args) {
        System.out.print("Operation (number op number): ");
        Scanner sc = new Scanner(System.in);
        String operator = "";
        double result = 0, op1 = 0, op2 = 0;
        for(int i = 0; i < 3; i++) {
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
        }
        switch (operator) {
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
        }

    }
}
