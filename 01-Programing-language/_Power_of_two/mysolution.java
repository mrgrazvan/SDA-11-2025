import java.util.Scanner;

public class mysolution {
    // public static
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & n - 1) == 0;
    }

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();            // Read an integer
//      System.out.println("You entered: " + n);
        System.out.println("IsPowerOfTwo: " + isPowerOfTwo(n));
    }


        public static void main(String[] args) {
        java.io.Console console = System.console();
        if (console != null) {
            String input = console.readLine("Enter a number: ");
            int n = Integer.parseInt(input);
//          System.out.println("You entered: " + n);
            System.out.println("IsPowerOfTwo: " + isPowerOfTwo(n));
        } else {
            System.out.println("Console not available.");
        }
    }

}