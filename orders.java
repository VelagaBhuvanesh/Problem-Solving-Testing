import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        double order = sc.nextDouble();

        double increment = order + (order * 10 / 100);
        double decrement = order - (order * 10 / 100);

        System.out.println("Original Number : " + order);
        System.out.println("After 10% Increment : " + increment);
        System.out.println("After 10% Decrement : " + decrement);

        sc.close();
    }
}