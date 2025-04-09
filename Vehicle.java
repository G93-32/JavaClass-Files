package RentalSystem;
//194196
public abstract class Vehicle {
    String vehicleName;

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    abstract int calculateRentalCost(int days);

    public void displayInfo() {
        System.out.println("Vehicle Name: " + vehicleName);
    }
}