package tasks;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(); // Number of employees

            int[] salaries = new int[n];

            // Read salaries and apply 10% increment immediately
            for (int i = 0; i < n; i++) {
                int salary = sc.nextInt();
                salaries[i] = (int) (salary * 1.10); // Increase by 10%
            }

            // Print updated salaries
            for (int i = 0; i < n; i++) {
                System.out.print(salaries[i]);
                if (i < n - 1) System.out.print(" ");
            }
        }
    }
}
