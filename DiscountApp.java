import java.util.function.BiFunction;

public class DiscountApp {
    public static void main(String[] args) {
        
        BiFunction<Double, String, Double> calculateDiscount =     (price, type) -> type.equals("PREMIUM") ? price * 0.80 : price * 0.95;

        
        double test1 = calculateDiscount.apply(1000.0, "PREMIUM");
        System.out.println("Premium Order of ₹1000 -> ₹" + test1);

        double test2 = calculateDiscount.apply(1000.0, "REGULAR");
        System.out.println("Regular Order of ₹1000 -> ₹" + test2);
    }
}
