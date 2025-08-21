// SUM AND AVERAGE OF N NUMBERS

import java.util.Scanner;

class SumAndAverage 
{
    public static void main(String[] args) 
   {
        Scanner scanner = new Scanner(System.in);

        // Input number of elements
        System.out.print("Enter how many numbers you want to enter: ");
        int n = scanner.nextInt();

        int sum = 0;

        // Read n numbers and calculate sum
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) 
        {
            int num = scanner.nextInt();
            sum += num;
        }

        // Calculate average
        double average = (double) sum / n;

        // Display result
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        scanner.close();
    }
}