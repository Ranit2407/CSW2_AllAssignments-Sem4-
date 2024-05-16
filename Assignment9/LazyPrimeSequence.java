import java.util.function.*;
import java.util.stream.*;

public class LazyPrimeSequence {
    public static void main(String[] args) {
        // Creating a lazy sequence of prime numbers using lambda expressions
        Supplier<IntStream> primeSequence = () -> IntStream.iterate(2, n -> n + 1)
                .filter(LazyPrimeSequence::isPrime);

        // Printing the first few prime numbers from the lazy sequence
        System.out.println("First few prime numbers:");
        primeSequence.get().limit(10).forEach(System.out::println);
    }

    // Method to check if a number is prime
    private static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
