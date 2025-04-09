package inheritance;

//Superclass: University
class University1 
{
 String universityName = "Strathmore University";
 
 void displayUniversity() 
 {
     System.out.println("University: " + universityName);
 }
}

//Subclass: College (Inheriting from University)
class School extends University1 
{
 String SchoolName = "Strathmore Institute";
  void displaySchooll() 
 {
     System.out.println("SchoolName: " + SchoolName);
 }
}

//Subclass: Department (Inheriting from College)
class Department1 extends School 
{
 String departmentName = "Computer Science";
 
 void displayDepartment() 
 {
     System.out.println("Department: " + departmentName);
 }
}

//Main Class
public class multilevelinheritance 
{
 public static void main(String[] args) 
 {
     Department1 ITDepartment = new Department1();
     // Accessing methods from all three classes
     ITDepartment.displayDepartment();
     ITDepartment.displaySchooll();
     ITDepartment.displayUniversity();
 }
}
