package Encapsulate;
public class rectangle
{
	private int length;
	private int width;
public int getlength()
{
	return length;
}
public int getwidth()
{
	return width;
}
public void setlength(int length1)
{
length = length1;
}
public void setwidth(int width1)
{
	width = width1;
}
public static void main(String[] args)
{
	rectangle r = new rectangle();
	r.setlength(6);
	r.setwidth(7);
	System.out.printf("Length="+ r.getlength()+"," + " Width="+ r.getwidth());
}

}