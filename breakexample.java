package controlstatements;

public class breakexample 
{
public static void main(String [] args)
{
	int a;
	for ( a=7;a<=20;a++)
	{
		System.out.println(" a is " + a);
		if (a==15)
			continue;
	}
		System.out.println("Skip "+ a);
	}

}
