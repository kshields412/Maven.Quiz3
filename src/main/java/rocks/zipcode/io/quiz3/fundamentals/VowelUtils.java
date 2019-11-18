package rocks.zipcode.io.quiz3.fundamentals;

import rocks.zipcode.io.quiz3.fundamentals.PigLatinGenerator;
/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    final static String vowels = "aeiouy";

    public static Boolean isVowel(Character character){
        for(int i = 0; i < vowels.length(); i++){
            if(character == vowels.charAt(i)){
                return true;
            } }
        return false;
    }


    public static Boolean hasVowels(String word) {
        String lcWord = word.toLowerCase();
        for(int i = 0; i < lcWord.length(); i++) {
            if (vowels.contains(String.valueOf(lcWord.charAt(i)))) {
                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word){
        String lcWord = word.toLowerCase();
        for (int i = 0; i < lcWord.length(); i++) {
            if (lcWord.contains(String.valueOf(vowels.charAt(i)))) {
                return i;
            }
        }
        // handle cases where a vowel is not found
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
