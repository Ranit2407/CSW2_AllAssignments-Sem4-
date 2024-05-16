public class q16_q21 {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println("Element: " + arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {

            LinkedListExample list = new LinkedListExample();
            list.add(1);
            System.out.println("Element at index 3: " + list.get(3));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {

            int[] arr = {1, 2, 3};
            recursiveArrayManipulation(arr, 5);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {

            int[] arr = {1, 2, 3};
            System.out.println("Element at index 5: " + arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            int[] arr = {1, 2, 3};
            recursiveArrayManipulation(arr, 5);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            int[][] matrix = {{1, 2}, {3, 4}};
            System.out.println("Element at index (2, 2): " + matrix[2][2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    private static void recursiveArrayManipulation(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            return;
        }
        System.out.println("Element at index " + index + ": " + arr[index]);
        recursiveArrayManipulation(arr, index - 1);
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListExample {
    Node head;

    public void add(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
    }

    public int get(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            if (current == null) {
                throw new ArrayIndexOutOfBoundsException("Index out of bounds");
            }
            current = current.next;
        }
        if (current == null) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
        return current.data;
    }
}
