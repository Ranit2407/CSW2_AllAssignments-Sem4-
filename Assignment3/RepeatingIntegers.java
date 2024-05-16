import java.util.HashSet;

public class RepeatingIntegers {
    public static void printRepeatingIntegers(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> repeating = new HashSet<>();

        for (int num : nums) {
            if (!seen.add(num)) {
                repeating.add(num);
            }
        }

        if (repeating.isEmpty()) {
            System.out.println("No repeating integers found.");
        } else {
            System.out.println("Repeating integers in the array:");
            for (int num : repeating) {
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {
        int[] num = {4, 2, 4, 5, 2, 3, 1, 6, 5};

        printRepeatingIntegers(num);
    }
}