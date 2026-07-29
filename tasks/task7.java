package tasks;
import java.util.Scanner;

public class task7 {

    // Method to compute nth Fibonacci number iteratively
    public static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be a non-negative integer.");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;

        long prev = 0, curr = 1;
        for (int i = 2; i <= n; i++) {
            long next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n (non-negative integer): ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            sc.close();
            return;
        }

        int n = sc.nextInt();
        sc.close();

        if (n < 0) {
            System.out.println("n must be non-negative.");
            return;
        }

        try {
            long result = fibonacci(n);
            System.out.printf("The %d-th Fibonacci number is: %d%n", n, result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
