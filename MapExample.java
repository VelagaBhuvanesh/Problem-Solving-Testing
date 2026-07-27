import java.util.*;
import java.util.stream.Collectors;

public class MapExample {
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
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());

            // MAP: Square each number
            List<Integer> squares = numbers.stream()
                    .map(n -> n * n)
                    .collect(Collectors.toList());

            System.out.println("Original numbers: " + numbers);
            System.out.println("Squared numbers: " + squares);

        } finally {
            scanner.close();
        }
    }
}
