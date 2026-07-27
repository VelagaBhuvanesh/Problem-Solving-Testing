import java.util.*;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter integers separated by spaces:");
            String inputLine = scanner.nextLine().trim();

            if (inputLine.isEmpty()) {
                System.out.println("No numbers entered.");
                return;
            }

            // Convert input to integers, skipping invalid entries
            List<Integer> numbers = Arrays.stream(inputLine.split("\\s+"))
                    .map(str -> {
                        try {
                            return Integer.parseInt(str);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid number: " + str + ". Skipping.");
                            return null;
                        }
                    })
                    .filter(Objects::nonNull) // Remove invalid entries
                    .collect(Collectors.toList());

            // FILTER: Keep only even numbers
            List<Integer> evenNumbers = numbers.stream()
                    .filter(n -> n % 2 == 0)
                    .collect(Collectors.toList());

            System.out.println("Even numbers: " + evenNumbers);

        } finally {
            scanner.close();
        }
    }
}
