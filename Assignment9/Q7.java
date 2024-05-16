import java.util.function.*;

public class Q7 {
    public static void main(String[] args) {
        // Define a recursive lambda expression to calculate factorial
        Function<Integer, Integer> factorial = n -> {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * factorial.apply(n - 1);
            }
        };

        // Calculate factorial of a given number using the lambda expression
        int number = 5;
        int result = factorial.apply(number);

        System.out.println("Factorial of " + number + " is: " + result);
    }
}
