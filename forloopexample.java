package ctr;
import java.util.Scanner;
public class forloopexample 
{
	public static void main(String [] args) 
	{
	System.out.println("Enter first number:");
	Scanner scanner = new Scanner(System.in);
	int number = scanner.nextInt();
	for(; number<=15; number ++)
	{
		System.out.println(number);
	}
	System.out.println("Loop is complete");
	scanner.close();
	}

}
