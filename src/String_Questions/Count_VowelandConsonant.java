package String_Questions;

public class Count_VowelandConsonant {
    /*
    Vowel and Consonant Counter:
    Count the number of vowels and consonants in a given string.
    */

    public static String countVowelsConstants(String input) {
        int vowels = 0;   int consonants = 0;
        input =  input.toLowerCase();

        // changing string to char and starting our logic
         // 1 - ccreating a loop with for
        //2 using nested if to identify vowels
        //3 extracting vowels and counting

        for (char ch : input.toCharArray()) {
            if (!(input == null) || Character.isLetter(ch)) {

                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                    vowels++;

                }else {consonants++;}
            }
        }
        return "Vowels:" + vowels + "/n" + " Constants: " + consonants;
    }

    public static void main(String[] args) {
        String str = "Listen";
        System.out.println(countVowelsConstants(str));
    }


}
