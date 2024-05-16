import java.util.HashMap;
public class SmallestMissing {
    public static int findSmallestMissingNumber(int[] nums) {
        HashMap<Integer, Integer> elementMap = new HashMap<>();

        // Populate the HashMap with elements from the array
        for (int num : nums) {
            elementMap.put(num, 1);
        }

        // Iterate from 1 to 10 to find the smallest missing positive number
        for (int i = 1; i <= 10; i++) {
            if (!elementMap.containsKey(i)) {
                return i;
            }
        }

        // If all numbers from 1 to 10 are present in the array, return 11
        return 11;
    }

    public static void main(String[] args) {
        int[] num = {3, 7, 2, 8, 4, 10, 6, 5, 1}; // Example unsorted array

        int smallestMissingNumber = findSmallestMissingNumber(num);
        System.out.println("Smallest missing positive number: " + smallestMissingNumber);
    }
}
