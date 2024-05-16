import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder();

        while (true) {
            System.out.println("Current String: " + text);
            System.out.println("Choose an operation:");
            System.out.println("a. Add a substring at a specified position");
            System.out.println("b. Remove a range of characters from the string");
            System.out.println("c. Modify a character at a specified index");
            System.out.println("d. Concatenate another string at the end");
            System.out.println("e. Exit");

            char choice = scanner.nextLine().charAt(0);

            switch (choice) {
                case 'a':
                    System.out.println("Enter the substring to add:");
                    String addString = scanner.nextLine();
                    System.out.println("Enter the position to add:");
                    int addPosition = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    text.insert(addPosition, addString);
                    break;
                case 'b':
                    System.out.println("Enter the start index of the range to remove:");
                    int startIndex = scanner.nextInt();
                    System.out.println("Enter the end index of the range to remove:");
                    int endIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    text.delete(startIndex, endIndex);
                    break;
                case 'c':
                    System.out.println("Enter the index of the character to modify:");
                    int modifyIndex = scanner.nextInt();
                    System.out.println("Enter the new character:");
                    char newChar = scanner.next().charAt(0);
                    scanner.nextLine(); // Consume newline
                    text.setCharAt(modifyIndex, newChar);
                    break;
                case 'd':
                    System.out.println("Enter the string to concatenate:");
                    String concatString = scanner.nextLine();
                    text.append(concatString);
                    break;
                case 'e':
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }
        }
    }
}
