package Encapsulate;

public class student {
    // Instance Variables (Non-Static Fields)
    private String name;
    private int age;

       // Constructor
    public student(String name, int age)
    {
        // Parameters (name, age)
        this.name = name;
        this.age = age;

    }

    // Method to display student details
    public void displayStudentInfo() 
    {
        // Local Variable
        String info = "Student Name: " + name + ", Age: " + age ;
        System.out.println(info);
    }

    

    public static void main(String[] args) {
        // Creating student objects for initializing the instance variable
        student s1 = new student ("Alice",16);
        student s2 = new student ("Ashley", 19);

        // Displaying student details
        s1.displayStudentInfo();
        s2.displayStudentInfo();

       
    }
}




