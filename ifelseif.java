package controlstatements;

public class ifelseif 
{
public static void main(String[] args)
{
	int a =5;
	int b =6;
	int c= 7;
	if (a<b&&c<b)
	{
		System.out.println("True");
	}
	else if(b<c && b<a)
	{
		System.out.println("False");
	}
	else
	{
		System.out.println("Neither");
	}
}
}
