import java.io.*;
import java.util.*;


interface PerformOperation {
    boolean check(int a);
}

class MyCalculator {
    public PerformOperation isOdd() {
        return n -> n % 2 != 0;
    }

    public PerformOperation isPrime() {
        return n -> {
            if (n < 2) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
    }

    public PerformOperation isPalindrome() {
        return n -> {
            String str = String.valueOf(n);
            String reverse = new StringBuilder(str).reverse().toString();
            return str.equals(reverse);
        };
    }
}

public class week1_1 {
    public static void main(String[] args) throws IOException {
        MyCalculator ob = new MyCalculator();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.getenv("ENV_TEST") != null ? System.in : System.in));
        // The rest of the main method is handled by the platform stub...
    }
}
