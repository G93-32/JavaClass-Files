package RentalSystem;
//194196
public class Car extends Vehicle {
    private int rentalCostPerDay;

    public Car(String vehicleName, int rentalCostPerDay) {
        super(vehicleName);
        this.rentalCostPerDay = rentalCostPerDay;
    }

    public int calculateRentalCost(int days) {
        return rentalCostPerDay * days;
    }
    
    public void displayCar() {
        System.out.println("Car Rental Cost per Day: Kes " + rentalCostPerDay);
    }
}