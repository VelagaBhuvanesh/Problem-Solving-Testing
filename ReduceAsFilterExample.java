import java.util.*;
import java.util.stream.Collectors;


public class ReduceAsFilterExample {
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

            // Using reduce() to filter even numbers
            List<Integer> evenNumbers = numbers.stream()
                    .reduce(
                        new ArrayList<>(), // identity (empty list)
                        (list, num) -> {   // accumulator
                            if (num % 2 == 0) {
                                list.add(num);
                            }
                            return list;
                        },
                        (list1, list2) -> { // combiner (for parallel streams)
                            list1.addAll(list2);
                            return list1;
                        }
                    );

            System.out.println("Even numbers (via reduce): " + evenNumbers);

        } finally {
            scanner.close();
        }
    }
}
