import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your operation: ");
        String operator = scanner.nextLine();
        String[] o;

        if (operator.contains("+")) {
            o = operator.split("\\+");
            double num1 = Double.parseDouble(o[0]);
            double num2 = Double.parseDouble(o[1]);
            double result = num1 + num2;
            System.out.println("Results: " + result);

        } else if (operator.contains("-")) {
            o = operator.split("\\-");
            double num1 = Double.parseDouble(o[0]);
            double num2 = Double.parseDouble(o[1]);
            double result = num1 - num2;
            System.out.println("Results: " + result);

        } else if (operator.contains("*")) {
            o = operator.split("\\*");
            double num1 = Double.parseDouble(o[0]);
            double num2 = Double.parseDouble(o[1]);
            double result = num1 * num2;
            System.out.println("Results:: " + result);

        } else if (operator.contains("/")) {
            o = operator.split("\\/");
            double num1 = Double.parseDouble(o[0]);
            double num2 = Double.parseDouble(o[1]);

            if (num2 == 0) {
                System.out.println("Error - Division by zero");
            } else {
                double result = num1 / num2;
                System.out.println("Results: " + result);
            }
        }

    }
}
