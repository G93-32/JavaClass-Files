package Encapsulate;

public class circle 
{
private double radius;
public circle(double radius)
{
	this.radius = radius;
}
public double getradius()
{
	return radius;
}
public void setradius(double newradius)
{
	radius=newradius;
}
public class test
{
	public static void main(String [] args)
	{
		circle cl= new circle(13.2);
		//cl.setradius(13.2);
		System.out.println(cl.getradius());
	}
}
}
