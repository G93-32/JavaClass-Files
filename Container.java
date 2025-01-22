package first;

public abstract class Container {
String label;
int volume;
public Container(String label, int volume) {
super();
this.label =label;
this.volume =volume;
}
public void ShowBasicDetails() {
	System.out.println("The label of this bottle is:"+ label);
	System.out.println("The volume of this bottle in milliliters is " +volume);
}
abstract void ShowDetails();

}
