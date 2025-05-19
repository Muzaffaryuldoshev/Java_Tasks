package String_Questions;

public class CheckAnagram {
    /*
    Check Anagram:
    Write a function to check if two strings are anagrams of each other.
     */
    public static Boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length() || s1 == null || s2 == null) {
            return false;
        }
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int[] charCount =  new int[256];

        for (int i = 0; i < s1.length(); i++) {
            charCount[s1.charAt(i)]++;
            charCount[s2.charAt(i)]--;
        }
        for(int count : charCount) {
            if (count != 0) {
                     return false;
            }
        }

      return true;
    }

    public static void main(String[] args) {
        String str = "Listen";
        String str1 = "Silent";
        Boolean result = areAnagrams(str, str1);
        System.out.println("result = " + result);

    }


}
