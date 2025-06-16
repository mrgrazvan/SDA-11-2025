public class Solution {
    public static int findElement(int[] numbers, int element) {
        int left = 0;
        int right = numbers.length - 1;

        while(left < right) {
            int mid = left + (right - left) / 2;

            if(numbers[mid] == element) {
                return mid;
            } else if(element < numbers[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }    

    public static void main(String[] args) {
        int[] numbers = {1, 3, 12, 15, 18, 21};
        System.out.println(findElement(numbers, 12));
    }
}
