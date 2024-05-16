@FunctionalInterface
interface Calculator {
    double calculate(double x, double y);
}

public class Q1 {
    public static void main(String[] args) {
        Calculator addition = (x, y) -> x + y;
        Calculator subtraction = (x, y) -> x - y;
        Calculator multiplication = (x, y) -> x * y;
        Calculator division = (x, y) -> {
            if (y != 0)
                return x / y;
            else
                throw new ArithmeticException("Cannot divide by zero");
        };

        double num1 = 10.0;
        double num2 = 5.0;

        System.out.println("Addition: " + addition.calculate(num1, num2));
        System.out.println("Subtraction: " + subtraction.calculate(num1, num2));
        System.out.println("Multiplication: " + multiplication.calculate(num1, num2));
        System.out.println("Division: " + division.calculate(num1, num2));
    }
}

