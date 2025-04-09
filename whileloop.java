package ctr;
import java.util.Scanner;
public class whileloop 
{
public static void main(String[] args)
{
	System.out.println("Enter the number:");
	Scanner scanner = new Scanner(System.in);
	
	int number =scanner.nextInt();
	while(number<=12)
	{
		System.out.println(number);
		number++;
	}
	System.out.println("While Loop completed");
	scanner.close();
}
}
