package rocks.zipcode.io.quiz3.fundamentals;

import rocks.zipcode.io.quiz3.fundamentals.VowelUtils;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator extends VowelUtils {

    public String translate(String str) {
        int length = str.length();
        int index = -1;
        String[] word = str.split(" ");
        for (int i = 0; i < length; i++) {
            for(int j = 0; i < word.length; i++){
                if (isVowel(word[i].charAt(j))) {
                    index = i;
                }
            }
        }
        if (index == -1)
            return "-1";
        return str.substring(index) + str.substring(0, index) + "ay";
    }
}
