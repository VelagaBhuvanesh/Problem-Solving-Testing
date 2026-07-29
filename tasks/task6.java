package tasks;
import java.util.Scanner;

public class task6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        // Validate input
        if (!scanner.hasNextLong()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.close();
            return;
        }

        long number = scanner.nextLong();
        scanner.close();

        // Handle negative numbers by taking absolute value
        number = Math.abs(number);

        int evenSum = 0;
        int oddSum = 0;

        // Extract digits and classify as even or odd
        while (number > 0) {
            int digit = (int) (number % 10);
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            number /= 10;
        }

        System.out.println("Sum of even digits: " + evenSum);
        System.out.println("Sum of odd digits: " + oddSum);
    }
}
