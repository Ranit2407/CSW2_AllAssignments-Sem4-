class Animal {
    private String name;
    private String color;
    private String type;

    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    // Override hashCode method to print unique ID for each object
    @Override
    public int hashCode() {
        return System.identityHashCode(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        // Creating objects of the Animal class
        Animal animal1 = new Animal("Dog", "Brown", "Pet");
        Animal animal2 = new Animal("Tiger", "Orange", "Wild");
        Animal animal3 = new Animal("Cat", "White", "Pet");

        // Printing hash codes of the objects
        System.out.println("Hash Code of Animal 1: " + animal1.hashCode());
        System.out.println("Hash Code of Animal 2: " + animal2.hashCode());
        System.out.println("Hash Code of Animal 3: " + animal3.hashCode());
    }
}
