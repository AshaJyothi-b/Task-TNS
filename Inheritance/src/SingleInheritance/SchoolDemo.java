package SingleInheritance;

public class SchoolDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Jyothi");
        s1.setAge(21);
        s1.setRollNo(101);
        s1.setCourse("B.Tech ECE");

        s1.displayPersonDetails();
        s1.displayStudentDetails();
    }
}