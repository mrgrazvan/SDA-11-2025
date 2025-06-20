package _02LinearDataStructures.Arrays.BinarySearch.FindElement.FindFirstAndLastPositionOfElementInSortedArray;

import java.util.Arrays;

public class Solution {
    public static int[] firstFirstAndLast(int[] numbers, int target) {
       int first = findFirst(numbers, target);
       int last = findLast(numbers, target);

       return new int[] {first, last};
    }

    public static int findFirst(int[] numbers, int target){
        int left = 0; 
        int right = numbers.length - 1;
        int minIndex = -1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(numbers[mid] == target) {
                minIndex = mid;
                right =  mid - 1;
            } else if(numbers[mid] < target ) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return minIndex;
    }

    public static int findLast(int[] numbers, int target){
        int left = 0; 
        int right = numbers.length - 1;
        int maxIndex = -1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(numbers[mid] == target) {
                maxIndex = mid;
                left =  mid + 1;
            } else if(numbers[mid] < target ) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return maxIndex;
    }



    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 2, 2, 3, 3, 3, 4, 5, 5, 5, 5, 5, 6, 7};
        System.out.println(Arrays.toString(firstFirstAndLast(numbers, 2)));
        System.out.println(Arrays.toString(firstFirstAndLast(numbers, 3)));
        System.out.println(Arrays.toString(firstFirstAndLast(numbers, 6)));


    }
}
