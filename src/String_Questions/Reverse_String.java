package String_Questions;

public class Reverse_String {
    /*
     Reverse a String:
     Write a method to reverse a string without using built-in reverse functions.
     */


    public static String reverseString(String input) {
        // Convert the input string to a character array
        char[] chars = input.toCharArray();


        // Initialize two pointers: one at the start, one at the end of the array
        int left = 0;
        int right = chars.length - 1;
        System.out.println("right = " + right);

        // Swap characters until the two pointers meet in the middle
        while (left < right) {
            // Swap characters at left and right indices
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // Move pointers towards the center
            left++;
            right--;
        }

        // Convert the character array back to a string and return it
        return new String(chars);
    }

     // Reversing with Loop statement
   public static String reversing(String input) {
        String str = "";

        for (int i = input.length() -1; i >= 0; i--){
            // appending String
          str += input.charAt(i);

        }
    return str;
    }


    public static void main(String[] args) {
        String word = "Hello Worl";
        String reversed =  reverseString(word);
        System.out.println("word = " + word);
        System.out.println("reversed = " + reversed);

       String method2 = reversing(word);
        System.out.println("reversing = " + method2);

    }
}
