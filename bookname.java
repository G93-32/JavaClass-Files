package inheritance;

class bookname1 
{
	String name = "Chinje";
	String Publisher = "Toxic Lyricali";
	String audience = "Children";
	int volume = 2;
	double price = 20.00;
	
	void displaybookname() {
		System.out.println("The name of the book is " + name );
	}
		void displayPublisher() {
			System.out.println("The name of the publisher is " + Publisher);
		}
		void displayaudience() {
			System.out.println("The audience are the " + audience );
		}
		void displayvolume() {
			System.out.println("This is volume " + volume );
		}
		void displayprice() {
			System.out.println("The price is " + price );
		}
}			
class authorname extends bookname1 
{
	String name = "alex";
	String country = "kenya";
	int age = 20;
	void displayname() {
		System.out.println("The name of the author is " + name );
	}
		void displaycountry() {
			System.out.println("The country of origin  is " + country);
		}
		void displayage() {
			System.out.println("The author is " + age + "Years old" );
		}
}
public class bookname
{
	public static void main(String[] args) {
		authorname alex = new authorname();
		alex.displayPublisher();
		alex.displayaudience();
		alex.displayvolume();
		alex.displayprice();
	}
}


