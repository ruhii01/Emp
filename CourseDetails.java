class Course {
    String courseName;
    String courseCode;
    String instructor;

    // Constructor to initialize course details
    public Course(String courseName, String courseCode, String instructor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor = instructor;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Instructor: " + instructor);
    }
}

public class CourseDetails {
    public static void main(String[] args) {
        // Creating course objects and initializing them with details
        Course course1 = new Course("Java Programming", "CS101", "Dr. John Doe");
        Course course2 = new Course("Database Systems", "CS102", "Dr. Jane Smith");

        // Displaying course details
        System.out.println("Course 1 Details:");
        course1.displayCourseDetails();

        System.out.println("\nCourse 2 Details:");
        course2.displayCourseDetails();
    }
}
