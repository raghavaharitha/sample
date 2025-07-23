public class strong
 {

    
    public static long factorial(int n)
 {
        if (n == 0 || n == 1)
 {
            return 1;
        }
        long fact = 1;
        for (int i = 2; i <= n; i++)
 {
            fact *= i;
        }
        return fact;
    }

    public static boolean isStrong(int number) 
{
        int originalNumber = number;
        long sumOfFactorials = 0;

        while (number > 0) {
            int digit = number % 10;
            sumOfFactorials += factorial(digit);
            number /= 10;
        }
        return sumOfFactorials == originalNumber;
    }

    public static void main(String[] args) 
{
        System.out.println("Strong numbers from 1 to 5000 are:");
        for (int i = 1; i <= 5000; i++) 
{
            if (isStrong(i)) 
{
                System.out.print(i + " ");
            }
        }
    }
}