import java.util.Scanner;

class Student {
    // Attributes
    int rollNo;
    String name;
    int age;
    String course;

    // Constructor
    Student(int rollNo, String name, int age, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Course : " + course);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter Roll No: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        // Creating Student object
        Student student = new Student(rollNo, name, age, course);

        // Display student details
        student.displayDetails();

        scanner.close();
    }
}
