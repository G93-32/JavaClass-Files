package variable;

public class addition // class definition
{
public  int a = 1;
public  int b = 4;
public  int addition;
public void display()
{
addition  = a + b;
System.out.println("Print the sum of a and b: "+ addition);
}

public static void main(String[] args)
{
addition a = new addition();
a.display();
}
}
