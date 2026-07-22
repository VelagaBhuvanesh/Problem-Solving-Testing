
import java.util.Collections;
import java.util.PriorityQueue;


public class task4 {
 


    
    public static int findKthSmallest(int[] nums, int k) {
        // Edge cases: check if array is empty or if k is out of bounds
        if (nums == null || nums.length == 0 || k > nums.length || k <= 0) {
            throw new IllegalArgumentException("Invalid array or value of k");
        }

        // Create a Max-Heap using Collections.reverseOrder()
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Process every element in the array
        for (int num : nums) {
            maxHeap.add(num);

            // If the heap grows larger than k, remove the largest element
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        // The top of the max-heap is now the k-th smallest element
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        int result = findKthSmallest(arr, k);
        System.out.println("The " + k + "rd smallest element is: " + result);
        // Output: 7 (The sorted sequence is 3, 4, 7, 10, 15, 20)
    }


}
