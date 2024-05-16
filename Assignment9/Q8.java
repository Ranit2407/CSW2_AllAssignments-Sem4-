public class Q8 {
    public static void main(String[] args) {
        // Create a thread using a lambda expression as the Runnable
        Thread thread = new Thread(() -> {
            System.out.println("Hello, CSW2!");
        });

        // Start the thread
        thread.start();
    }
}
