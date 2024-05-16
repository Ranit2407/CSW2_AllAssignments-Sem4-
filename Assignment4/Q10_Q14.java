import java.lang.Math;

public class q10_q14 {
    public static double calculateExpression1(double x) {
        if (Math.abs(x - Math.PI / 2) < 0.0001 || Math.abs(x + Math.PI / 2) < 0.0001) {
            return Double.NaN; // Avoid division by zero
        }
        return (Math.sin(x) + Math.cos(x)) / Math.tan(x);
    }

    public static double calculateExpression2(double x) {
        if (Math.abs(Math.tan(x) - 1.0 / Math.tan(x)) < 0.0001) {
            return Double.NaN; // Avoid division by zero
        }
        try {
            double result = Math.log(Math.sin(x) + Math.cos(x)) / (Math.tan(x) - 1.0 / Math.tan(x));
            if (Double.isNaN(result) || Double.isInfinite(result)) {
                throw new ArithmeticException("Invalid mathematical operation");
            }
            return result;
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
            return Double.NaN;
        }
    }

    public static double calculateExpression3(double x) {
        if (Math.abs(Math.tan(x) + 1) < 0.0001) {
            return Double.NaN; // Avoid division by zero
        }
        try {
            double inner = Math.sin(x) * Math.cos(x);
            if (inner < 0) {
                throw new ArithmeticException("Negative value inside square root");
            }
            double result = Math.sqrt(inner) / (Math.tan(x) + 1);
            if (Double.isNaN(result) || Double.isInfinite(result)) {
                throw new ArithmeticException("Invalid mathematical operation");
            }
            return result;
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
            return Double.NaN;
        }
    }

    public static double calculateExpression4(double x) {
        if (Math.abs(Math.sin(x) + Math.cos(x)) < 0.0001) {
            return Double.NaN; // Avoid division by zero
        }
        return (Math.sin(x) * Math.cos(x)) / (Math.sin(x) + Math.cos(x));
    }

    public static double calculateExpression5(double x) {
        if (Math.abs(Math.tan(x) - 1.0 / Math.tan(x)) < 0.0001) {
            return Double.NaN; // Avoid division by zero
        }
        try {
            double inner = Math.abs(Math.sin(x) + Math.cos(x));
            if (inner <= 0) {
                throw new ArithmeticException("Non-positive value inside logarithm");
            }
            double result = Math.log(inner) / (Math.tan(x) - 1.0 / Math.tan(x));
            if (Double.isNaN(result) || Double.isInfinite(result)) {
                throw new ArithmeticException("Invalid mathematical operation");
            }
            return result;
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
            return Double.NaN;
        }
    }

    public static void main(String[] args) {
        double x = Math.PI / 4; // Example value of x

        // Test each expression
        System.out.println("Expression 1 result: " + calculateExpression1(x));
        System.out.println("Expression 2 result: " + calculateExpression2(x));
        System.out.println("Expression 3 result: " + calculateExpression3(x));
        System.out.println("Expression 4 result: " + calculateExpression4(x));
        System.out.println("Expression 5 result: " + calculateExpression5(x));
    }
}
