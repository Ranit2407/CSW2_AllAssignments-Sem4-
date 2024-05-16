class Student1 implements Comparable<Student1> {
    private String name;
    private int rn;
    private int totalMark;

    public Student1(String name, int rn, int totalMark) {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getRn() {
        return rn;
    }

    public int getTotalMark() {
        return totalMark;
    }

    // Overriding compareTo method of Comparable interface
    @Override
    public int compareTo(Student1 other) {
        // Compare based on totalMark
        return Integer.compare(this.totalMark, other.totalMark);
    }

    // Linear search method to find a student object within an array
    public static Student1 linearSearch(Student1[] students, int rn) {
        for (Student1 student : students) {
            if (student.getRn() == rn) {
                return student;
            }
        }
        return null; // Return null if student with specified roll number not found
    }
}

public class StudentMain {
    public static void main(String[] args) {
        // Creating an array of Student1 objects
        Student1[] students = {
                new Student1("Alice", 101, 85),
                new Student1("Bob", 102, 90),
                new Student1("Charlie", 103, 75),
                new Student1("David", 104, 80)
        };

        // Searching for a student using linear search
        int searchRollNumber = 102;
        Student1 foundStudent = Student1.linearSearch(students, searchRollNumber);

        if (foundStudent != null) {
            System.out.println("Student found: " + foundStudent.getName() +
                    ", Roll Number: " + foundStudent.getRn() +
                    ", Total Marks: " + foundStudent.getTotalMark());
        } else {
            System.out.println("Student with roll number " + searchRollNumber + " not found.");
        }
    }
}