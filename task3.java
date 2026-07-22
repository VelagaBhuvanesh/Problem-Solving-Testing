public class task3 {

    public static int findMax(int[] arr) {
        // Edge case: check if array is empty
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }

        // Initialize max with the first element
        int max = arr[0];

        // Loop through the rest of the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 45, 2, 89, 34, 67, 50};
        
        int maxElement = findMax(numbers);
        System.out.println("The maximum element is: " + maxElement);
    }


}
