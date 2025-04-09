package variable;

public class breakexample 
{
	public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 8) {
                System.out.println("Breaking the loop at i = " + i);
                break; // Exit the loop when i equals 5
            }
            System.out.println("i = " + i);// terminating statement
        }
        System.out.println("Loop ended.");// unlabelled form
    }

}

    