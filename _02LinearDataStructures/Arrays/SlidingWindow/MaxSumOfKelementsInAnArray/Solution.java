package _02LinearDataStructures.Arrays.SlidingWindow.MaxSumOfKelementsInAnArray;

public class Solution {
    public static int findMaxSum(int[] numbers, int k) {
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += numbers[i];
        }

        int windowSum = maxSum;

        for (int i = k; i <= numbers.length - 1; i++ ) {
            windowSum = windowSum + numbers[i] - numbers[i-k];
            System.out.println("window sum" +  windowSum);
            if(windowSum > maxSum) {
                maxSum = windowSum;
            }
        }
        return maxSum;   
    }


    public static void main(String[] args) {
        int[] numbers = {1,2,4,8, 4, 5, 2,5, 7};
        System.out.println(findMaxSum(numbers, 3));
    }
}
