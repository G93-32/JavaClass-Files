package first;

public class Employee {
String name;
String department;
String position;
long salary;
long phoneNumber;
void receiveSalary() {
	System.out.println("Receive salary at the end of every month.\n");
}
void quota() {
	System.out.println("Make sure the quota is followed to avoid any fines.\n");
}
void punctuality() {
	System.out.println("Make sure to be punctual to avoid being fined");
}
public static void main(String[] args) {
	Employee Gurjot = new Employee();
	Gurjot.receiveSalary();
	Gurjot.quota();
	Gurjot.punctuality();
}
}
