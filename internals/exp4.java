// READING NUMBERS INTO AN ARRAY AND DISPLAYING IT
import java.util.Scanner;

 class ArrayInputOutput 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter how many numbers you want to store: ");
        int n = scanner.nextInt();

        int    arr[] = new int[n];

        // Read array elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = scanner.nextInt();
        }

        // Display array elements
        System.out.println("The numbers you entered are:");
        for (int i = 0; i < n; i++) 
       {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}