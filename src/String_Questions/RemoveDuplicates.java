package String_Questions;

public class RemoveDuplicates {
    /*
    QSN:5. **Remove Duplicates**:
     Remove duplicate characters from a string while preserving the order.

     */
    /*
    Logic:
    1 - create a method with a str input
    2 - change str to chars
    3 -  check if it has duplicates with for loop
    4 - if it has remove duplicates at all
                         */

    public static String removeDuplicates(String input) {
        input = input.toLowerCase(); // madam
        String str = "";
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if(str.indexOf(ch) == -1 ) {
                str = str + ch;
            }

        }
         return str;

    }

    public static void main(String[] args) {
        String str = "madam";
        str = removeDuplicates(str);
        System.out.println(str);
    }

}
