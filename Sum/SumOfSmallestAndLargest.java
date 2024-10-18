import java.util.Scanner;

public class SumOfSmallestAndLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers from the user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        // Find smallest and largest numbers
        int smallest = Math.min(Math.min(num1, num2), num3);
        int largest = Math.max(Math.max(num1, num2), num3);

        // Calculate sum of smallest and largest
        int sum = smallest + largest;

        // Display the result
        System.out.println("Sum of smallest and largest numbers: " + sum);
        
        scanner.close();
    }
}

