package ctr;

public class evenodd 
{
    public static void main(String[] args) 
    {
        for (int number =1; number <= 24; number++)
        {
           if (number % 2 == 0) 
            {
                System.out.println(number + " is even.");
                continue; 
            }
            if (number>13) {
            System.out.println(number + " is odd.");
            break; 
        }
            System.out.println(number);
        }
        
        
    }
}
