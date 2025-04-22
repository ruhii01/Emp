class Student {
    String name;
    int rollNumber;
    String course;

    // Constructor to initialize student details
    public Student(String name, int rollNumber, String course) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        // Hardcoding the student details
        Student student1 = new Student("John Doe", 101, "Computer Science");
        Student student2 = new Student("Jane Smith", 102, "Electrical Engineering");

        // Displaying student details
        student1.displayStudentDetails();
        student2.displayStudentDetails();
    }
}
