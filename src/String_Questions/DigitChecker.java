package String_Questions;

public class DigitChecker {
    /*
     **Digit Checker**: Check if a string contains only digits.
     * a method (bool) String arg
     * How to check:
     * Character.IsDigit(charAt(i))
     * returns true if a string only contains digits
     */
    public static boolean checkDigits(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(!Character.isDigit(arr[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "13456789";
        System.out.println(checkDigits(str));
    }
}