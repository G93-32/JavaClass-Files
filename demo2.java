package first;

public class demo2 {
	public static void main(String[] args) {
		System.out.println("Hello world, welcome to DBIT");
		String Firstname = "Gurjot ";
		String Lastname = "Singh";
		String Fullname = Firstname + Lastname;
		 int myAge = 19;
		 int birthyr;
		 birthyr = 2005;
		 int x = 5;
		 int y =6 ;
		 boolean myBool = true;
		 float f1 = 35e3f;
		 double d1 = 12E4d;
		 long myNum = 15000000000L;
		 byte myNum2 = 100;
		 short myNum3 = 5000;
		 char myVar1 = 65, myVar2 = 66, myVar3 = 67;
		 int items = 50;
		 float costPerItem = 9.99f;
		 float totalCost = items * costPerItem;
		 char currency = '$';
		 //Printing variables
		System.out.println(Firstname);
		System.out.println(Lastname);
		System.out.println(Fullname);
	    System.out.println("I am "+ myAge + " Years old");
	    System.out.println("I was born on " + birthyr);
	    System.out.println("The sum of x and Y is "+x+y);
	    System.out.println("The prodcut of X and y is "+x*y);
	    System.out.println(myBool);
	    System.out.println(f1);
	    System.out.println(d1);
	    System.out.println(myNum);
	    System.out.println(myNum2);
	    System.out.println(myNum3);
	    System.out.println("My results; ");
	    System.out.println(myVar1);
	    System.out.println(myVar2);
	    System.out.println(myVar3);
	    System.out.println("Number of items: " + items);
	    System.out.println("Cost per item: " + costPerItem + currency);
	    System.out.println("Total cost = " + totalCost + currency);


	}
}
