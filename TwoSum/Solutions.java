package TwoSum;

import java.util.Arrays;

// import java.util.Arrays;

public class Solutions {

    // 0(n*n)
     public static int[] solveTwoSum(int[] numbers, int target) {
        for(int i = 0; i <= numbers.length-2; i++) {
            for(int j = i + 1; j <= numbers.length-1; j++) {
                if(numbers[i] + numbers[j] == target) {
                    System.out.println(i + " " + j);
                    return new int[] {i,j};
                }
            }
        }
        return null;
     }

     // O(n log n)
     public static int[] solveTwoSumUsingBinarySearch(int[] numbers, int target) {
        int[][]  numbersWithIndex = new int[numbers.length][2];
        for(int i = 0; i <= numbers.length -1 ; i++) {
            numbersWithIndex[i][0] = numbers[i];
            numbersWithIndex[i][1] = i;
        }

        Arrays.sort(numbersWithIndex, (a,b) -> Integer.compare(a[0], b[0]));
        // System.out.println(Arrays.deepToString(numbersWithIndex)); 

        for(int i = 0; i <= numbers.length - 1; i++) {
            int complement = target - numbers[i];

            int index = binarySearch(numbersWithIndex, i + 1, numbers.length - 1, complement);
            if(index != -1) {
                // return new int[] {i, numbersWithIndex[index][1]};
                return new int[] {i, index};
            }
        }

        return new int[] {-1,-1};
     }

     public static int binarySearch(int[][] arr, int left, int right, int target) {
        while(left < right) {
            int mid = left + (right - left) / 2;

            if(arr[mid][0] == target) {
                // return mid;
                return arr[mid][1];
            } else if (target < arr[mid][0]) {
                right =  mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
     }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 8, 12, 1};
        // Arrays.asList(solveTwoSum(numbers, 9)).forEach(System.out::println);
        solveTwoSum(numbers, 9);

         System.out.println( Arrays.toString(solveTwoSumUsingBinarySearch(numbers, 9)));

    }     
}
