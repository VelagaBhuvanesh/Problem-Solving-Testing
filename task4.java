 import java.util.Arrays;


public class task4 {
   
    public static void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) return;
        
        // Handle cases where k is greater than the array length
        k = k % nums.length; 
        
        // 1. Reverse the entire array
        reverse(nums, 0, nums.length - 1);
        // 2. Reverse the first k elements
        reverse(nums, 0, k - 1);
        // 3. Reverse the remaining elements
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(arr, k);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
        // Output: [5, 6, 7, 1, 2, 3, 4]
    }


}
