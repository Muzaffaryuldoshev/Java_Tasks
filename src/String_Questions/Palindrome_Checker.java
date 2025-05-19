package String_Questions;

public class Palindrome_Checker {
    /*
    QSN:4.
    **Palindrome Checker**: Determine if a given string reads the same backward.
   */
    /*
    Logic:
    Write a method in Java that:

    Takes a string as input: -->  IsPalindrome(String input)

    Reverses it: --> for( input.length()-1; i >= 0; i--) { return str+=input.charAt(i)}

    Compares the reversed version with the original (ignoring case, possibly ignoring spaces)
    -->

    Returns true if it's a palindrome, else false.
     */



   public static Boolean isPalindrome(String input){
      input = input.toLowerCase();
      String str = " ";
     for (int i = input.length() -1; i >= 0; i-- ){
         str += input.charAt(i);
     }
     if (str.equals(input)){
         return true;
     }else {
         return false;
     }

   }

    public static void main(String[] args) {
        String  str = "man";
        System.out.println(isPalindrome(str));
    }



}
