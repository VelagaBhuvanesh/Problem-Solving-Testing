
import java.util.Scanner;

public class MaximumProfitAnalyzer {
    public static int maxProfit(int[] arr) {
        int currentMax = arr[0];
        int maxSoFar = arr[0];
        
        for (int i = 1;i < arr.length; i++){
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        
        return maxSoFar;
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days:");
        int n = sc.nextInt();
        int[] profitLoss = new int[n];
        System.out.println("Enter daily profit/loss values:");
        
        for (int i = 0;i < n; i++){
            profitLoss[i] = sc.nextInt();
        }
        
        int result = maxProfit(profitLoss);
        System.out.println("maxium obtainable profit ="+ result);
        sc.close();
    }
}