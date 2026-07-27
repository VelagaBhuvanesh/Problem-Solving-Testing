import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        double number = sc.nextDouble();

        double increment = number + (number * 10 / 100);
        double decrement = number - (number * 10 / 100);

        System.out.println("Original Number : " + number);
        System.out.println("After 10% Increment : " + increment);
        System.out.println("After 10% Decrement : " + decrement);

        sc.close();
    }
}