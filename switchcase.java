package controlstatements;

public class switchcase 
{

public static void main(String [] args)
{
	char month = 'z';
	int mname;
	switch (month)
	{
	case 'n':
		mname = 1;
		break;
	case 2:
		mname = 4;
		break;
	case 3:
		mname= 6;
		break;
	case 'z':
		mname = 12;
		break;
	case 5:
		mname = 9;
		break;
	case 'k':
		mname = 67;
		break;
		default:
			mname = 000;
			break;
	}
System.out.println("The month is"+" "+ mname);
}
}