
public class Solution {
    public static void printTriangle(int noOfRows) {
        int count = 1;

        for(int row = 1; row <= noOfRows; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
    
    
    public static void main(String[] args) {
        printTriangle(5);
    }
}
