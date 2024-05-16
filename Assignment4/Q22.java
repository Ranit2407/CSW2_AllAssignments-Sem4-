class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}
public class q22 {
    public static void main(String[] args) {
        try {
            throw new CustomCheckedException("This is a custom checked exception.");
        } catch (CustomCheckedException e) {
            System.err.println("CustomCheckedException caught: " + e.getMessage());
        }
    }
}
