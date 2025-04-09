package variable;

public class returnexample 
{
	public static void main(String[] args) 
	{
        double result = addNumbers(5.1, 10.2); //method invocation section
        System.out.println("Sum: " + result);
    }

    public static double addNumbers(double a, double b) 
    { //skipped part
        return a + b; // Return the sum of a and b
    }
}

    
