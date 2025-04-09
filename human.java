package Encapsulate;

public class human 
{
private static int malecount;
private static int femalecount;
private String name;
private char sex;
private int age;
public int getage()
{
	return age;
}
public void setAge(int a)
{
	age = a;
}
public String getName()
{
	return name;
}
public void setName(String n)
{
	name = n;
}
public int getSex()
{
	return sex;
}
public void setSex(char s)
{
	sex = s;
}
public static void showSexDistribution()
{
public void tellsex()
{
		
}
public void tellAge()
{
		
}

public class test
{
	public static void main(String[]args)
	{
		human h1 = new human();
		human h2 = new human ();
		human h3 = new human();
	
	h1.setName("James");h1.setSex('M'); h1.setAge(18);
	h2.setName("Irene");h2.setSex('F'); h2.setAge(11);
	h3.setName("Thomas");h3.setSex('M'); h3.setAge(13);
	human.malecount=2;
	human.femalecount = 4;
h1.tellSex(); h1.tellAge();
h2.tellSex(); h2.tellAge();
h3.tellSex(); h3.tellAge();
person.showSexDistribution();
}
}
}