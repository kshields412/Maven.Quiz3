package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator extends VowelUtils {

    public String translate(String str) {
        String[] stringArr = str.split(" ");
        String output = "";
        for (String s : stringArr) {
            if (startsWithVowel(s)) {
                output = output + s + "way ";
            } else if (!hasVowels(s)) {
                output = output + s + "ay ";
            } else {
                Integer index = getIndexOfFirstVowel(s);
                output = output + s.substring(index) + s.substring(0, index) + "ay ";
            }
        }

        return output.substring(0, output.length() -1);
    }
}
