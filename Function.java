/*Write a program to perform the choice
1:Sum of digit
2:Prime No
3:Fibonacci series
Using Function
*/

package Daily_Programs;

import java.util.Scanner;

public class Function 
{

    public static void main(String[] args) 
    {
    	
        Scanner scanner = new Scanner(System.in);

        // Display menu
        System.out.println("Choose an operation:");
        System.out.println("1: Sum of Digits");
        System.out.println("2: Prime Number Check");
        System.out.println("3: Fibonacci Series");

        // Get user choice
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                SumOfDigits();
                break;

            case 2:
                PrimeNumber();
                break;

            case 3:
                FibonacciSeries();
                break;

            default:
                System.out.println("Invalid choice. Please choose 1, 2, or 3.");
        }

        scanner.close();
    }

    // Function to calculate the sum of digits
    public static void SumOfDigits() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int sum = 0;
        while (num != 0) 
        {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }

    // Function to check if a number is prime
    public static void PrimeNumber() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int count=0;
        
        for(int i =1; i<=num; i++)
        {
        	if(num%i==0)
        	{
        		count++;
        	}
        }
        if(count==2)
        {
        	System.out.println(num + "is a Prime Nnmber");
        }
        else
        {
        	System.out.println(num + "is not a Prime Nnmber");
        }
    }

    // Function to print Fibonacci series
    // F(n)=F(n−1)+F(n−2)
    public static void FibonacciSeries() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of Fibonacci series: ");
        int length = scanner.nextInt();
        
        int firstTerm, secondTerm;
        
        //Take the input from the user
        System.out.print("Enter the First Term: ");
        firstTerm = scanner.nextInt();
        
        System.out.print("Enter the Second Term: ");
        secondTerm = scanner.nextInt();
        
        System.out.print("Fibonacci Series: " + firstTerm + ", " + secondTerm);
        
        for (int i = 1; i <= length; i++) 
        {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(", " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();

    }
}
