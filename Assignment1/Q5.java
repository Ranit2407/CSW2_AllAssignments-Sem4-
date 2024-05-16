//public class Q5 {
//    public static void main(String[] args) {
//        College c1=new College("ITER","Khandagiri");
//        College c2=new College("KIIT","Patia");
//        Student s1=new Student("2241016204","Ranit",c1);
//        Student s2=new Student("2241016205","Rachit",c2);
//        s2.displayStudentInfo();
//
//    }
//}
//
//class College{
//    private String collegeName;
//    private String collegeLoc;
//
//    College(String collegeName,String collegeLoc){
//        this.collegeName=collegeName;
//        this.collegeLoc=collegeLoc;
//    }
//
//    String getCollegeName(){
//        return collegeName;
//    }
//
//    String getCollegeLoc(){
//        return collegeLoc;
//    }
//}
//
//class Student{
//    private String studentId;
//    private String studentName;
//    private College college;
//
//    Student(String studentId,String studentName,College college){
//        this.studentId=studentId;
//        this.studentName=studentName;
//        this.college=college;
//    }
//
//    void displayStudentInfo(){
//        System.out.println("College Name :"+college.getCollegeName());
//        System.out.println("College Location :"+college.getCollegeLoc());
//        System.out.println("Student ID :"+studentId);
//        System.out.println("Student Name :"+studentName);
//    }
//
//}
