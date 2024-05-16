class Car {
    private String model;
    private String color;
    private double speed;

    public Car(String model, String color, double speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getSpeed() {
        return speed;
    }

    public boolean isFasterThan(Car otherCar) {
        return this.speed > otherCar.speed;
    }
}

public class CarDriver{
    public static void main(String[] args) {
        // Create two car objects
        Car car1 = new Car("Toyota Camry", "Blue", 120.5);
        Car car2 = new Car("Honda Civic", "Red", 115.8);

        // Compare car speeds
        if (car1.isFasterThan(car2)) {
            System.out.println(car1.getModel() + " is faster than " + car2.getModel());
            System.out.println("Details of the faster car:");
            System.out.println("Model: " + car1.getModel());
            System.out.println("Color: " + car1.getColor());
            System.out.println("Speed: " + car1.getSpeed() + " km/h");
        } else {
            System.out.println(car2.getModel() + " is faster than " + car1.getModel());
            System.out.println("Details of the faster car:");
            System.out.println("Model: " + car2.getModel());
            System.out.println("Color: " + car2.getColor());
            System.out.println("Speed: " + car2.getSpeed() + " km/h");
        }
    }
}