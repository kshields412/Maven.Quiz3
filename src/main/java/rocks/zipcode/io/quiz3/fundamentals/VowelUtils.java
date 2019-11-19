package rocks.zipcode.io.quiz3.fundamentals;

import rocks.zipcode.io.quiz3.fundamentals.PigLatinGenerator;
/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    final static String vowels = "aeiou";

    public static Boolean isVowel(Character character){
        Character lcChar = Character.toLowerCase(character);
        Boolean isAVowel = false;
        for(int i = 0; i < vowels.length(); i++){
            if(lcChar == vowels.charAt(i)){
                isAVowel = true;
            } }
        return isAVowel;
    }


    public static Boolean hasVowels(String word) {
        char[] lcWord = word.toLowerCase().toCharArray();
        char[] vowelsArr = vowels.toCharArray();
        Boolean hasAVowel = false;

        for(int i = 0; i < vowelsArr.length; i++){
            for(int j = 0; j < lcWord.length; j++) {
                if (lcWord[j] == vowelsArr[i]) {
                    hasAVowel = true;
                    break;
                }
            }
            if(hasAVowel){
                break;
            }
        }
        return hasAVowel;
    }

    public static Integer getIndexOfFirstVowel(String word){
        char[] lcWord = word.toLowerCase().toCharArray();
        for (int i = 0; i < lcWord.length; i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if (lcWord[i] == vowels.charAt(j)) {
                    return i;
                } } }
        // handle cases where a vowel is not found
        // index of each vowel might be easier
        return -1;
    }
    //https://stackoverflow.com/questions/26660306/finding-where-the-first-vowel-in-a-word-occurs

    public static Boolean startsWithVowel(String word) {
        String lcWord = word.toLowerCase();
        for (int i = 0; i < vowels.length(); i++) {
            if (vowels.charAt(i) == lcWord.charAt(0)) {
                return true;
            }
        }
        return false;
    }
}
