package tasks;
import java.util.Scanner;

public class task9 {

    // Method to get the last digit of a number (ignoring sign)
    public static int getLastDigit(int num) {
        return Math.abs(num % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input two integers
            System.out.print("Enter first integer: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second integer: ");
            int num2 = sc.nextInt();

            // Get last digits
            int lastDigit1 = getLastDigit(num1);
            int lastDigit2 = getLastDigit(num2);

            // Calculate sum
            int sum = lastDigit1 + lastDigit2;

            // Output result
            System.out.println("Last digit of " + num1 + " is: " + lastDigit1);
            System.out.println("Last digit of " + num2 + " is: " + lastDigit2);
            System.out.println("Sum of last digits: " + sum);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            sc.close();
        }
    }
}
