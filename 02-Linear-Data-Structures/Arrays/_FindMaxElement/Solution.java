
public class Solution {
    public static int findMaxElement(int[] numbers) {
        int max = numbers[0];
        for(int i = 1; i <= numbers.length -1; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 12, 1, 3, 18, 2, 15};
        System.out.println(findMaxElement(numbers));
    }
}
