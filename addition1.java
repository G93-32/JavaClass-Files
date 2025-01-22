package first;
import java.util.Scanner;
public class addition1 {
 public static void main(String[] args){
 Scanner input = new Scanner(System.in);
 int number1;
 int number2;
 int sum;
 System.out.print("Enter first number " );
 number1 = input.nextInt();
 System.out.print("Enter second number ");
 number2 = input.nextInt();
 sum = number1 + number2;
 System.out.printf("Enter the sum of two numebers:  %d",sum);
 sum = input.nextInt();
}
}
