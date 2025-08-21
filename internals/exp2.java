// FIBONACCI NUMBERS UP TO A GIVEN LIMIT

import java.util.Scanner;

class FibonacciLimit 
{
    public static void main(String[] args) 
   {
        Scanner scanner = new Scanner(System.in);

        // Input limit
        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();

        int a = 0, b = 1,c;

        System.out.println("Fibonacci numbers up to " + limit + ":");

        // Print Fibonacci numbers up to limit
        while (a <= limit) 
       {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }

        scanner.close();
    }
}