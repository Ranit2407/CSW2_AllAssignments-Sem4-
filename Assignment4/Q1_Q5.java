import java.io.*;

public class Q1_Q5 {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length()); // This will throw NullPointerException

        } catch (NullPointerException e) {
            System.out.println("Task 1: Handling NullPointerException");
            System.out.println("NullPointerException occurred: " + e.getMessage());
        }

        try {
            String input = "a1b2c3d4e5";
            if (input == null || input.isEmpty()) {
                throw new NullPointerException("Input string is null or empty");
            }
            boolean found = false;
            for (int i = 0; i < input.length() - 2; i++) {
                char prevChar = input.charAt(i);
                char currentChar = input.charAt(i + 1);
                char nextChar = input.charAt(i + 2);
                if ((isVowel(prevChar) && !isVowel(currentChar) && Character.isDigit(nextChar))) {
                    System.out.println("Task 2: Display numeric characters preceded by a vowel and consonant");
                    System.out.println(nextChar);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Task 2: Display numeric characters preceded by a vowel and consonant");
                System.out.println("No numeric characters preceded by a vowel and consonant.");
            }
        } catch (NullPointerException e) {
            System.out.println("Task 2: Display numeric characters preceded by a vowel and consonant");
            System.out.println("Error: " + e.getMessage());
        }

        try {
            throw new CustomNullPointerException("Task 3: Custom NullPointerException occurred!");
        } catch (CustomNullPointerException e) {
            System.out.println(e.getMessage());
        }

        try {
            String filePath = null;
            readFile(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("Task 4: Custom FileNotFoundException and FileReadPermissionException classes");
            System.out.println("FileNotFoundException occurred: " + e.getMessage());
        } catch (FileReadPermissionException e) {
            System.out.println("Task 4: Custom FileNotFoundException and FileReadPermissionException classes");
            System.out.println("FileReadPermissionException occurred: " + e.getMessage());
        }
    }

    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

    private static void readFile(String filePath) throws FileNotFoundException, FileReadPermissionException {
        if (filePath == null) {
            throw new NullPointerException("File path is null.");
        }
        throw new FileNotFoundException("File not found");
    }
}

class CustomNullPointerException extends RuntimeException {
    public CustomNullPointerException(String message) {
        super(message);
    }
}

class FileReadPermissionException extends RuntimeException {
    public FileReadPermissionException(String message) {

        super(message);
    }
}
