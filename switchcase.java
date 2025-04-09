package variable;

public class switchcase 
{
	
	
public static void main(String[] args)

{
	int month = 1;
	String monthstring;
	switch (month)	
	{
	case 1 : 
		monthstring = "January";
	break;
	
	case 2: 
		monthstring = "february";
	break;
	case 3: 
		monthstring = "march";
	break;
	case 4: 
		monthstring = "april";
	break;
	case 5: 
		monthstring = "may";
	break;
	default:
		monthstring = "missing month";
	break;	
		
}
	System.out.println("The month is"+ " " +monthstring);
}
}