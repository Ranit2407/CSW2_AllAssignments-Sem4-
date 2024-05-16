class Student<T> {
    private String name;
    private T rollNumber; // Roll number can be either an integer or a string
    private int age;

    // Constructor
    public Student(String name, T rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(T rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
    }
}

public class StudentDriver {
    public static void main(String[] args) {
        // Creating student objects with different roll number types
        Student<String> student1 = new Student<>("Alice", "S123", 20);
        Student<Integer> student2 = new Student<>("Bob", 456, 21);

        // Displaying student details
        System.out.println("Student 1 Details:");
        student1.displayDetails();
        System.out.println();

        System.out.println("Student 2 Details:");
        student2.displayDetails();
    }
}