import java.util.ArrayList;
import java.util.List;
public class Q9 {
    public static void main(String[] args) {
        Student1 student1 = new Student1("S001", "Ranit");
        Student1 student2 = new Student1("S002", "Ryan");

        Course course1 = new Course("C001", "Java Programming");
        Course course2 = new Course("C002", "Database Management");

        EnrollmentSystem enrollmentSystem = new Enrollment();

        // Demonstrate enrollment and dropping of students
        enrollmentSystem.enrollStudent(student1, course1);
        enrollmentSystem.enrollStudent(student2, course2);
        enrollmentSystem.displayEnrollmentDetails();
        enrollmentSystem.dropStudent(student1, course1);
        enrollmentSystem.displayEnrollmentDetails();
    }
}

class Student1 {
    private String studentId;
    private String studentName;

    public Student1(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
}

// Course class
class Course {
    private String courseId;
    private String courseName;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }
}

// EnrollmentSystem interface
interface EnrollmentSystem {
    void enrollStudent(Student1 student, Course course);

    void dropStudent(Student1 student, Course course);

    void displayEnrollmentDetails();
}

class Enrollment implements EnrollmentSystem{
    private List<Student1> enrolledStudents;
    private List<Course> enrolledCourses;

    public Enrollment(){
        this.enrolledStudents = new ArrayList<Student1>();
        this.enrolledCourses = new ArrayList<Course>();
    }

    public void enrollStudent(Student1 student, Course course) {
        enrolledStudents.add(student);
        enrolledCourses.add(course);
        System.out.println(student.getStudentName() + " enrolled in " + course.getCourseName());
    }
    public void dropStudent(Student1 student, Course course) {
        int index = enrolledStudents.indexOf(student);
        if (index != -1 && enrolledCourses.get(index).equals(course)) {
            enrolledStudents.remove(index);
            enrolledCourses.remove(index);
            System.out.println(student.getStudentName() + " dropped from " + course.getCourseName());
        } else {
            System.out.println("Student not found in the specified course.");
        }
    }

    public void displayEnrollmentDetails() {
        System.out.println("Enrollment Details:");
        for (int i = 0; i < enrolledStudents.size(); i++) {
            System.out.println(enrolledStudents.get(i).getStudentName() + " is enrolled in " +
                    enrolledCourses.get(i).getCourseName());
        }
        System.out.println();
    }
}

