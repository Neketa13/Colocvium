import java.util.Scanner;
public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        try {
            double result = a / b;
            if (b != 0) {
                return result;
            }
        }
        catch (NumberFormatException e) {
        }
            System.out.println("Error");
        return 0;

    }

    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            Calculator calculator = new Calculator();
            System.out.println("Enter the first number: ");
            double inputFirstNumber = scanner.nextDouble();
            System.out.println("Enter the second number: ");
            double inputSecondNumber = scanner.nextDouble();
            System.out.println("Enter operator (+, -, *, /):");
            char operation = scanner.next().charAt(0);
            switch (operation) {
                case '+':
                    System.out.println("Result: " + calculator.add(inputFirstNumber, inputSecondNumber));
                    break;
                case '-':
                    System.out.println("Result: " + calculator.subtract(inputFirstNumber, inputSecondNumber));
                    break;
                case '*':
                    System.out.println("Result: " + calculator.multiply(inputFirstNumber, inputSecondNumber));
                    break;
                case '/':
                    System.out.println("Result: " + calculator.div(inputFirstNumber, inputSecondNumber));
                    break;
                default:
                    System.out.println("Not a correct character");
            }
        }
    }





