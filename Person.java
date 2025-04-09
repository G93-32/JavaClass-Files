package Encapsulate;
//Define a class with private fields
class Person 
{
	
	
	    private String name;
	    private int age;

	    // Constructor
	    //public Person(String name, int age) {
	     //  this.name = name;
	     // this.age = age;
	   // }

	    // Getter method for name
	    public String getName() {
	        return name;
	    }

	    // Setter method for name
	    public void setName(String newname) {
	        name = newname;
	    }

	    // Getter method for age
	    public int getAge() {
	        return age;
	    }

	    // Setter method for age
	    public void setAge(int age) {
	        if (age > 0) {  // Adding validation
	            this.age = age;
	        } else {
	            System.out.println("Age must be positive!");
	        }
	    }
	

	// Main class to test encapsulation
	    public class Test
	    {
	    		    }
	    public static void main(String[] args) {
	        // Create an object of Person
	        Person person = new Person();
	        person.setName("Alice");
	        person.setAge(10);
	        
	        // Access and modify data using getters and setters
	        System.out.println("Name: " + person.getName());
	        System.out.println("Age: " + person.getAge());

	        // Update values
	        person.setName("Bob");
	        person.setAge(30);

	        System.out.println("Updated Name: " + person.getName());
	        System.out.println("Updated Age: " + person.getAge());

	        // Trying to set a negative age (demonstrating encapsulation with validation)
	        person.setAge(-5);
	    }
	}


