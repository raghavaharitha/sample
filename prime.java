public class prime {

    public static void main(String[] args)
 {
        System.out.println("Prime numbers from 1 to 100 are:");

        for (int i = 2; i <= 100; i++)
 { 
            if (isPrime(i)) 
{
                System.out.print(i + " ");
            }
        }
    }

    
    public static boolean isPrime(int number)
 {
        if (number <= 1) 
{ 
            return false;
        }
       
        
        for (int i = 2; i * i <= number; i++)
 { 
            if (number % i == 0) 
{
                return false; 
            }
        }
        return true; 
    }
}