import java.util.Arrays;

public class myAnagram {
    public static void main(String[] args) {

        //String input = "anagram";
        //String output = "nagaram";

        String input = "cat";
        String output = "rat";

        char[] chars_input = input.toCharArray();
        Arrays.sort(chars_input);               
        
        char[] chars_output = output.toCharArray();
        Arrays.sort(chars_output);               

        System.out.println(Arrays.equals(chars_input, chars_output));
    }
}
