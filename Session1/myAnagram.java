import java.util.Arrays;

public class myAnagram {
    public static void main(String[] args) {

        String input = "anagram";
        String output = "nagaram";

        char[] chars_input = input.toCharArray();
        Arrays.sort(chars_input);               
        
        char[] chars_output = output.toCharArray();
        Arrays.sort(chars_output);               

        System.out.print(Arrays.equals(chars_input, chars_output));
    }
}
