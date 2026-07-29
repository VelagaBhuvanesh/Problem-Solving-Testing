package tasks;
public class task1 {
    public static void main(String[] args) {
        // Initialize the array
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Displaying elements using a traditional for loop:");
        // Loop through the array using indices
        for (int i = 0; i < numbers.length; i++) {
            // Accessing the element via index i
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
