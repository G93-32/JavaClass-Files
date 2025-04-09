package polym;

//Super Class 
class Circle { 
 private double radius;

 // Constructor to initialize radius
 public Circle(double radius) {
     this.radius = radius;
 }

 // Getter method for radius 
 public double getRadius() {
     return radius;
 }

 // Method to calculate the area of a circle (Overridden in subclass)
 public double getVolume() { 
     double volume = 3.14 * radius * radius; 
     return volume;
 }
} 

//Sub Class
class Cylinder extends Circle { 
 private double length;

 // Constructor to initialize radius and length
 public Cylinder(double radius, double length) {
     super(radius);  
     this.length = length;
 }

 // Overriding the getVolume method to calculate the volume of a cylinder
 
 public double getVolume() { 
     return super.getVolume() * length;  // Uses the area of the base circle
 } 
}

//Main class
public class RecapInheritance {
 public static void main(String[] args) {
     // Creating an object of Circle
     Circle c = new Circle(5);  // Radius = 5
     System.out.println("Area of Circle: " + c.getVolume());

     // Creating an object of Cylinder
     Cylinder cy = new Cylinder(5, 10);  // Radius = 5, Length = 10
     System.out.println("Volume of Cylinder: " + cy.getVolume());
 }
}
