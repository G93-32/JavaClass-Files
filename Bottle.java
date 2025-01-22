package first;

public class Bottle extends Container{
String color;
String Bottletype;
public Bottle(String label, int volume, String color, String Bottletype) {
	super(label, volume);
	this.color =color;
	this.Bottletype = Bottletype;
}
public void ShowDetails() {
	System.out.println("The color  of this bottle is: "+ color);
	System.out.println("The type of this bottle is "+ Bottletype);
}
}