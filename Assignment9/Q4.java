@FunctionalInterface
interface Shape {
    double area();

    default void printArea() {
        System.out.println("Area: " + area());
    }
}

public class Q4 {
    public static void main(String[] args) {
        // Implementing Shape interface using lambda expressions for circle, square, and rectangle
        Shape circle = () -> {
            double radius = 5.0;
            return Math.PI * radius * radius;
        };

        Shape square = () -> {
            double side = 4.0;
            return side * side;
        };

        Shape rectangle = () -> {
            double length = 6.0;
            double width = 3.0;
            return length * width;
        };

        // Printing the area of each shape using the default method
        System.out.println("Circle:");
        circle.printArea();

        System.out.println("Square:");
        square.printArea();

        System.out.println("Rectangle:");
        rectangle.printArea();
    }
}
