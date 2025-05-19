package String_Questions;

public class CharacterFrequency {
    /*
    QSN: **Character Frequency**: Count and display frequency of each character.
     */

    public static void countFrequency(String input) {
        input=input.toLowerCase().trim();
        int[]  freq = new int[256];

       for (char c : input.toCharArray()) {
           freq[c]++;
       }
       for (int i = 0; i < freq.length; i++) {
           if(freq[i]>0){
               System.out.println((char)i + " : " + freq[i]);
           }
       }


    }


    public static void main(String[] args) {
        String str  =  "you are the best";
        countFrequency(str);
    }
}
