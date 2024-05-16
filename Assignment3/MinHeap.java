import java.util.PriorityQueue;
public class MinHeap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 10, 8, 7, 3, 4, 6, 5, 9};

        // Create a PriorityQueue (min heap) and add elements from the array
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.offer(num);
        }

        // Dequeue elements from the PriorityQueue to retrieve them in sorted order
        System.out.println("Elements in sorted order (using min heap):");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
    }
}