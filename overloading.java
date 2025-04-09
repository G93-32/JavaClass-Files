package polym;


public class overloading
{
    
    
    void result(int a) {
        System.out.println("Integer: " + a);
    }


    void result(double a) {
        System.out.println("Double: " + a);
    }

 
    void result(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void main(String[] args) {
        overloading obj = new overloading();
        
        obj.result(11);        // Calls the method with an int parameter
        obj.result(10.8);      // Calls the method with a double parameter
        obj.result(5, 35);     // Calls the method with two int parameters
    }
}
