// CHECK PRIME NUMBER OR NOT

import java.util.Scanner;

class PrimeCheck
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean isPrime = true;

        // 0 and 1 are not prime
        if (num <= 1) 
        {
            isPrime = false;
        } 
        else 
        {
            // Check divisibility from 2 to sqrt(num)
            for (int i = 2; i <= Math.sqrt(num); i++) 
            {
                if (num % i == 0) 
                {
                    isPrime = false;
                    break;
                }
            }
        }

        // Display result
        if (isPrime) 
        {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is NOT a Prime number.");
        }

        scanner.close();
    }
}