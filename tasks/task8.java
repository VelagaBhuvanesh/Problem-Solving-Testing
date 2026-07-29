package tasks;
import java.util.Scanner;

public class task8 {

    // Method to check if a number is palindrome
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            return false; // Negative numbers are not palindromes
        }

        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            // Check for integer overflow before multiplying
            if (reversed > (Integer.MAX_VALUE - digit) / 10) {
                return false; // Overflow means it's not a valid palindrome check
            }
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.close();
            return;
        }

        int num = scanner.nextInt();
        scanner.close();

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }
    }
}
