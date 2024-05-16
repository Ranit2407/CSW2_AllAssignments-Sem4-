import java.util.InputMismatchException;
import java.util.Scanner;

public class q25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = readInteger(scanner);
        System.out.println("You entered: " + number);
    }

    public static int readInteger(Scanner scanner) {
        int number;
        while (true) {
            try {
                number = scanner.nextInt();
                break; // Break the loop if input is successfully parsed as an integer
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer:");
                scanner.next(); // Consume invalid input
            }
        }
        return number;
    }
}
