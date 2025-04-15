package polym;
class Cocacola
{
	void drink(String brand)
	{
		System.out.println("Cocacola:"+ brand);
	}
}
class Pepsi extends Cocacola
{        @Override
	void drink(String brand)
	{
		System.out.println("Pepsi:"+ brand);
	}
public class Drink 
{
public static void main(String[] args)
{
Cocacola c = new Cocacola();
Pepsi p = new Pepsi();
c.drink("Enjoy your thirst");
p.drink("Enjoy your breath");
}
}
}
