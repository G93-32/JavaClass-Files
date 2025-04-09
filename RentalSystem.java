package RentalSystem;
//194196
public class RentalSystem {
    public static void main(String[] args) {
        Vehicle car = new Car("Volkswagen", 5500);
        Vehicle bike = new Bike("Hero", 990);

        car.displayInfo();
        System.out.println("Car Rental Cost for 5 days: Kes " + car.calculateRentalCost(5));
        
        System.out.println();
        
        bike.displayInfo();
        System.out.println("Bike Rental Cost for 5 days: Kes " + bike.calculateRentalCost(5));
    }
}