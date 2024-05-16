import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Append \n2. Insert \n3. Delete \n4. Reverse \n5. Replace \n6. Exit");
            System.out.print("Choose an operation: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    System.out.print("Enter string to append: ");
                    buffer.append(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Enter index and string to insert: ");
                    int insertIndex = scanner.nextInt();
                    scanner.nextLine();
                    buffer.insert(insertIndex, scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Enter start and end indices to delete: ");
                    int start = scanner.nextInt();
                    int end = scanner.nextInt();
                    buffer.delete(start, end);
                    break;
                case 4:
                    buffer.reverse();
                    break;
                case 5:
                    System.out.print("Enter start, end index, and replacement string: ");
                    start = scanner.nextInt();
                    end = scanner.nextInt();
                    scanner.nextLine();
                    buffer.replace(start, end, scanner.nextLine());
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println("Current Buffer: " + buffer);
            System.out.println("Length: " + buffer.length() + ", Capacity: " + buffer.capacity());
        }
    }
}