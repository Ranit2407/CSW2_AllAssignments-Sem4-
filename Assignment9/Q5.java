import java.util.*;
import java.util.stream.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a list of strings
        System.out.println("Enter a list of strings (one per line, type 'done' when finished):");
        List<String> strings = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("done")) {
            strings.add(input);
            input = scanner.nextLine();
        }

        // Convert strings to uppercase, filter out strings starting with a vowel, and print remaining strings
        System.out.println("Strings in uppercase, filtered:");
        strings.stream()
                .map(String::toUpperCase)
                .filter(s -> !startsWithVowel(s))
                .forEach(System.out::println);
    }

    // Method to check if a string starts with a vowel
    private static boolean startsWithVowel(String str) {
        String firstChar = str.substring(0, 1);
        return "AEIOU".contains(firstChar);
    }
}
