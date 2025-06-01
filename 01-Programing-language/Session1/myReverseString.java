public class myReverseString {

    public static void main(String[] args) {
    //  char[] array = { 'h', 'e', 'l', 'l', 'o' };
        char[] array = { 'H', 'a', 'n', 'n', 'a', 'h' };

        for (int i = array.length - 1; i >= 0; i--)
            System.err.print(array[i]);
        
        System.err.println();
    }
}
