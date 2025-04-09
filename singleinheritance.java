package inheritance;

//Superclass
class University 
{
String universityName = "Strathmore University";

void displayUniversity()
{
   System.out.println("University Name: " + universityName);
}
}

//Subclass
class Department extends University 
{
String departmentName = "Information Technology";

void displayDepartment() {
   System.out.println("Department: " + departmentName);
}
}

//Main class
public class singleinheritance
{
public static void main(String[] args) 
{
   Department dept = new Department();
   dept.displayUniversity(); // Inherited method
   dept.displayDepartment(); // Subclass method
}
}


