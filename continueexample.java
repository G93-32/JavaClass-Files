package variable;

public class continueexample 
{
	    public static void main(String[] args) {
	        for (int i = 1; i <= 10; i++) 
	        {
	            if (i == 5) {
	                System.out.println("Skipping i = " + i);
	                continue; // Skip the rest of the loop body for i = 3
	            }
	            System.out.println("i = " + i);
	        }
	        System.out.println("Loop ended.");//unlabelled form
	    }
	}
