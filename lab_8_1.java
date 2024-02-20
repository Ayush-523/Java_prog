
abstract class Student {
    int rollNo;
    int regNo;

    abstract String course();
}

// Subclass Kiitian extending Student
class Kiitian extends Student {

    String course() {
        return "B.Tech in Computer Science";
    }
}

// Main class
public class lab_8_1 {
    public static void main(String[] args) {

        // Create an object of subclass Kiitian
        Kiitian student1 = new Kiitian();
        student1.rollNo = 2106199;
        student1.regNo = 629414;

        // Print student details and course
        System.out.println("Roll No: " + student1.rollNo);
        System.out.println("Reg No: " + student1.regNo);
        System.out.println("Course: " + student1.course());
    }
}