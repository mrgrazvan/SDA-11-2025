public class Solution {
    public static int countOnes1(int n) {
        int count = 0;
        while(n != 0) {
            if((n & 1) == 1) {
                count++;
            }
            n >>>= 1;
            // n = n >>> 1;
        }
        return count;
    }

    public static int countOnes2(int n) {
        int count = 0;
        for(int i = 0; i < 32; i++) {
            if((n & 1) == 1) {
                count++;
            }
            n >>>= 1;
            // n = n >>> 1;
        }
        return count;
    }

    public static int countOnes3(int n) {
        int count = 0;
        while(n != 0) {
            n = n & (n-1);
            count++;
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(countOnes1(-128));
        System.out.println(countOnes1(22));
        System.out.println(countOnes2(-2));
        System.out.println(countOnes3(-2));
    }
}
