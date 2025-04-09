package RentalSystem;
//194196
public class Bike extends Vehicle {
    private int rentalCostPerDay;

    public Bike(String vehicleName, int rentalCostPerDay) {
        super(vehicleName);
        this.rentalCostPerDay = rentalCostPerDay;
    }

    public int calculateRentalCost(int days) {
        return rentalCostPerDay * days;
    }
    
    public void displayBike() {
        System.out.println("Bike Rental Cost per Day: Kes " + rentalCostPerDay);
    }
}