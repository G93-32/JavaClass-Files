package first;

public class addition {
int number1;
int number2;
int number3;
int number4;
int sum;
void summation() {
	number1 = 5;
	number2 = 10;
	sum = number1+number2;
	
	System.out.println("Sum of two numbers is " + sum);
}
public static void main(String[] args) {
	addition m = new addition();
	m.summation();
}
}

