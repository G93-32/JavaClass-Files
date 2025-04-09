package variable;

public class Masinga
{
	//global variables
	public static int studentpopulation =42;
	public static String  unitname = "Object Oriented Programming";
	//instance variables
	public String desktop;
	public String projector;
	public int clock;
	public Masinga(String desktop, String projector, int clock)//constructor
	{
	 this.desktop =desktop;
	 this.projector = projector;
	 this.clock = clock;
	}
	public void details()
	{
	 int door=1; //first local variable is int door
	 int window=22;// second local variable is int window
	 System.out.println("This class has "+door + " door" + " and " + window+ " windows");
	 System.out.println("Desktop brand is "+desktop+" and "+" projector brand is "+ projector + " and there is "+ clock + " clock");
	}
	public static void main(String [] args)
	{
	System.out.println("The population of this class is "+ studentpopulation + " and the unit name is called "+ unitname);	
	Masinga a = new Masinga("Lenovo","Epson", 1);
	
	a.details();
	//a.details();
	}
}
