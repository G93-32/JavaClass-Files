package ctr;
import java.util.Scanner;
public class dowhileloop 
	{
public static void main(String[] args)
	{
	System.out.println("Enter number:");
	Scanner scanner =new Scanner(System.in);
	int number =scanner.nextInt();
	do
	{
		System.out.println(number);
		number ++;
	}
		while (number <= 14);
	System.out.println("End of the while loop");
	scanner.close();
	}
	
}
		
		

