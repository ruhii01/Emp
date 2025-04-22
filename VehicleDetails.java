class Vehicle {
    String vehicleName;
    String registrationNumber;
    String vehicleType;

    // Constructor to initialize vehicle details
    public Vehicle(String vehicleName, String registrationNumber, String vehicleType) {
        this.vehicleName = vehicleName;
        this.registrationNumber = registrationNumber;
        this.vehicleType = vehicleType;
    }

    // Method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("\nVehicle Details:");
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Vehicle Type: " + vehicleType);
    }
}

public class VehicleDetails {
    public static void main(String[] args) {
        // Hardcoding the vehicle details
        Vehicle vehicle1 = new Vehicle("Honda Civic", "ABC1234", "Car");
        Vehicle vehicle2 = new Vehicle("Yamaha FZ", "XYZ5678", "Motorcycle");

        // Displaying vehicle details
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}
