import java.util.function.*;

public class Q6 {
    public static void main(String[] args) {
        // Function that returns another function to calculate the square of a number
        Function<Double, Double> squareFunction = getSquareFunction();

        // Using the returned function to calculate squares
        double number1 = 5.0;
        double number2 = 7.5;

        System.out.println("Square of " + number1 + ": " + squareFunction.apply(number1));
        System.out.println("Square of " + number2 + ": " + squareFunction.apply(number2));
    }

    // Function that returns another function to calculate the square of a number
    private static Function<Double, Double> getSquareFunction() {
        return (Double x) -> x * x;
    }
}
