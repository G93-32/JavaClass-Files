package variable;

public class vehicle 
{
	//global variables
public static  String name;
public static double price;

public void show(String brand, String country)//parameter
{
	//local variables
	//brand = "Mercedes";
	//country = "Germany";
			
	String spec = "The brand of vehicle is "+brand + " and" + "the country is "+ country;
	System.out.println(spec);
}

public static void main(String[] args)
{
vehicle v1 = new vehicle();
v1.show("Mercedes", "Germany");
}
}