package String_Questions;

public class URLify {
    /*
    9. **URLify**: Replace all spaces in a string with '%20'.
     */

    public  static void urlify(String str) {
      //  StringBuilder sb = new StringBuilder(str);

       str = str.replaceAll(" ", "%20");
        System.out.println(str);
    }

    public static void main(String[] args) {
        String str =  "you are the best";
        urlify(str);
    }
}

