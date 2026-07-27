import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        double salary = sc.nextDouble();

        double increment = salary + (salary * 10 / 100);
        double decrement = salary - (salary * 10 / 100);

        System.out.println("Original Number : " + salary);
        System.out.println("After 10% Increment : " + increment);
        System.out.println("After 10% Decrement : " + decrement);

        sc.close();
    }
}