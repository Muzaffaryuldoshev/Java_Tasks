package String_Questions;

public class First_NonRepeated {
    /*
     **First Non-Repeating Character**: Find the first character that doesn't repeat.
     */
    /*
    logic:
Logic to find the first non-repeating character in a string:

1. Initialize an array of size 256 (for ASCII characters) to count occurrences of each character.
2. Iterate over the string once and increment the count for each character.
3. Iterate over the string a second time and check the count of each character.
4. The first character with a count of 1 is the first non-repeating character.
5. If no such character exists, handle accordingly (e.g., throw an exception or return a special value).

This approach uses two passes over the string and constant extra space, making it simple and efficient.
     */

    public static char nonRepeated(String str) {
        int[] counts = new int[256]; // ASCII character counts
        for (char c : str.toCharArray()) {
            counts[c]++;
        }
        for (char c : str.toCharArray()) {
            if (counts[c] == 1) {
                return c;
            }
        }
        throw new RuntimeException("No non-repeating character found");
    }

    public static void main(String[] args) {
        String str  = "Muzaffar";
        System.out.println(nonRepeated(str));
    }


}
