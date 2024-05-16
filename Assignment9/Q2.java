import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "kiwi", "strawberry");

        // Custom comparator using a lambda expression
        Comparator<String> lengthComparator = (str1, str2) -> Integer.compare(str2.length(), str1.length());

        // Sorting the list of strings using the custom comparator
        Collections.sort(strings, lengthComparator);

        // Displaying the sorted list
        System.out.println("Sorted list of strings based on length in descending order:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
