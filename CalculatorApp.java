import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the first number: ");
                int num1 = scanner.nextInt();

                System.out.print("Enter the second number: ");
                int num2 = scanner.nextInt();

                System.out.println("Choose an operation: ");
                System.out.println("1. Addition (+)");
                System.out.println("2. Subtraction (-)");
                System.out.println("3. Multiplication (*)");
                System.out.println("4. Division (/)");

                String choice = scanner.next();
//                scanner.nextLine();

                int result;

                switch (choice) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                            return;
                        }
                        break;
                    default:
                        System.out.println("Invalid choice");
                        return;
                }

                System.out.println("Result: " + result);
            }
        }



