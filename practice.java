import java.util.function.Predicate;

public class practice {
    public static void main(String[] args) {
        
        Predicate<Double> isHighValue = amount -> amount >= 10000.0; 

        double order1 = 12500.0;
        double order2 = 4500.0;
        double order3 = 100.0;

        System.out.println("Order of ₹" + order1 + " High Value? -> " + isHighValue.test(order1));
        System.out.println("Order of ₹" + order2 + " High Value? -> " + isHighValue.test(order2));
        System.out.println("Order of ₹" + order3 + " High Value? -> " + isHighValue.test(order3));
    }
}
