package String_Questions;

import javax.imageio.stream.ImageInputStream;

public class TitleCaseConvertor {

    /*
    QSN:
    **Title Case Converter**:-->  Convert a string to title case (first letter of each word capitalized).
     */

    public static String convertor(String str) {
        str = str.toLowerCase();
        // split
        String[] arr = str.split(" ");
        // build a new String to append
        StringBuilder sb = new StringBuilder();
        for (String word : arr) {
            if (word.length() > 0) {
                sb.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }
            return sb.toString();

        }

    public static void main(String[] args) {
        String man = "you are the best";
        System.out.println(convertor(man));
    }



}
