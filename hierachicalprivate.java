package inheritance;
//Superclass
class worker
{
private String school;
private String type;
public String  getschool()
{
	return school;
}
public String  gettype()
{
	return type;
}
void setschool(String schooll)
{
	school = schooll;
}
void settype(String typee)
{
	type = typee;
	
}
}
class don extends worker
{
String designation = "Lecturer";
double salary = 200000.00;
void displayfaculty()
{
System.out.println("Fauclty is a "+ designation + " and earns "+ salary + " per month");		
}
}
class management extends don
{
String designation = "Accountant";
double salary = 150000.00;
void displaystaff()
{
System.out.println("Staff is an "+ designation + " and earns "+ salary + "per month");		
}
}
public class hierachicalprivate
{
public static void main (String[] args)
{
management h1 = new management ();

h1.displayfaculty();
h1.displaystaff();
h1.setschool("SCES");
h1.settype("fulltimer");
System.out.println("Employee's school "+ h1.getschool() + " and is a "+ h1.gettype());	
}
}

