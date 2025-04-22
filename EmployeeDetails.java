
class Employee {
    String name;
    int employeeId;
    String department;

    // Constructor to initialize employee details
    public Employee(String name, int employeeId, String department) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        // Creating employee objects and initializing with details directly
        Employee employee1 = new Employee("John Doe", 101, "HR");
        Employee employee2 = new Employee("Jane Smith", 102, "IT");
        Employee employee3 = new Employee("Alice Johnson", 103, "Finance");

        // Displaying employee details
        System.out.println("Employee 1 Details:");
        employee1.displayDetails();

        System.out.println("\nEmployee 2 Details:");
        employee2.displayDetails();

        System.out.println("\nEmployee 3 Details:");
        employee3.displayDetails();
    }
}
