public class Solution {
    public static void fizzBuzz(int n) {
        for(int i = 1; i < 100; i++) {
            if(i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if(i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
        }
    }

    public static void main(String[] args) {
        fizzBuzz(100);
    }    
}
