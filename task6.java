public class task6 {
    public static void printAllPairs(int[] arr) {
        int n = arr.length;
        System.out.println("Printing all ordered pairs (including self-pairs):");

        // Both loops run through the entire array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printAllPairs(arr);
    }
}
