package first;

public class Plane {
  int engine;
  int numberOfwheels;
  int steering;
  String brand;
  int doors;
  void takeOff() {
	  System.out.println("Make sure u reach maximum speed to take off.\n");
  }
  void land() {
	  System.out.println("Make sure landing gears are retracted to land the plane.\n");
  }
  void brake() {
	  System.out.println("Use reverse thrusters to brake more efficiently.\n");
  }
  public static void main(String[] args) {
	  Plane boeing747 = new Plane();
	  boeing747.takeOff();
	  boeing747.land();
	  boeing747.brake();
  }
}
