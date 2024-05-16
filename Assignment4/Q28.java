public class q28 {
    public static void main(String[] args) {
        try {
            recursiveMethod(1);
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError: " + e.getMessage());
        }
    }

    public static void recursiveMethod(int i) {
        System.out.println("Current value of i: " + i);
        recursiveMethod(i + 1);
    }
}
