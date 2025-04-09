package inheritance;
//Superclass
class employee
{
String school = "SCES ";
String type = "full-timer";
void displayemployee()
{
System.out.println("Employee's school "+ school + " and is a "+ type);	
}
}
class faculty extends employee
{
String designation = "Lecturer";
double salary = 200000.00;
void displayfaculty()
{
System.out.println("Fauclty is a "+ designation + " and earns "+ salary + " per month");		
}
}
class staff extends employee
{
String designation = "Accountant";
double salary = 150000.00;
void displaystaff()
{
System.out.println("Staff is an "+ designation + " and earns "+ salary + "per month");		
}
}
public class hierarchical
{
public static void main (String[] args)
{
staff h1 = new staff ();

h1.displaystaff();
h1.displaystaff();
h1.displayemployee();
}
}

