package polym;
class override1{
      void display(int a) {
        System.out.println("Integer1: " + a);}

    void display(double a){
        System.out.println("Double1: " + a);}
   
    void display(int a, int b)  {
        System.out.println("Sum1: " + (a + b)); }
    void displaymessage(){
    	System.out.println("Message from parent class"); }}   
class override  extends  override1
{	void displaymessage()
	{
		System.out.println("Message fromc child class");
	}
public static void main(String[] args) 
{
	override1 obj = new override1(); 
        obj.display(10);       
       obj.display(10.5);      
       obj.display(5, 15);    
      obj.displaymessage();
        
      
      override obj1 = new override(); //object for override
      obj1.display(10);        
      obj1.display(10.5);     
      obj1.display(5, 15);     
      obj1.displaymessage();
        
}
}
