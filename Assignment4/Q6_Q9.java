import java.util.Scanner;

public class q6_q9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 6: Handle NumberFormatException
        try {
            System.out.println("Enter a number: ");
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println("Number entered: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }

        // Task 7: Convert string input to integer
        try {
            System.out.println("Enter a number: ");
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }

        // Task 8: Find square root of integer numbers
        try {
            System.out.println("Enter an integer number: ");
            int number = Integer.parseInt(scanner.nextLine());
            double squareRoot = Math.sqrt(number);
            System.out.println("Square root of " + number + " is " + squareRoot);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Invalid input or cannot calculate square root of negative numbers.");
        }

        // Task 9: Divide two numbers input by the user
        try {
            System.out.println("Enter the dividend: ");
            int dividend = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the divisor: ");
            int divisor = Integer.parseInt(scanner.nextLine());
            double result = (double) dividend / divisor;
            System.out.println("Result of division: " + result);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Invalid input or cannot divide by zero.");
        }

        scanner.close();
    }
}
