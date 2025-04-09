package abstraction;
//abstract class -- parent class
public abstract class computer 
{
	//data members/attributes/variables
	int storage;
	String name;
	int screensize;
	int memory;
	//constructor
	public computer(int storage, String name, int memory,int screensize) 
	{
		//super() makes sure all variables instantiated in constructor is available for inheritance from this parent class
		super();
		//instantiation
		this.storage = storage;
		this.name = name;
		this.screensize = screensize;
		this.memory = memory;
	}
	//abstract method
	//abstract void 
	//non-abstract/concrete method -- normal method
	public void displaydetails()
	{
		//implementation of method
		System.out.println("Storage: " + storage + "gb");
		System.out.println("Name: " + name);
		System.out.println("Screensize: " + screensize);
		System.out.println("Memory: " + memory);
	}
	abstract void displaycpu();

}
