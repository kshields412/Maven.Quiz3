package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.ArrayList;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        String input = str.toLowerCase();
        ArrayList<String> output = new ArrayList<>();

        for(int i = 0; i < input.length(); i++){
            output.add(StringUtils.capitalizeNthCharacter(input, i));
        }
        for(int i = 0; i < output.size(); i++) {
            if (output.get(i).equals(input)) {
                output.remove(output.get(i));
            }
        }
            return output.toArray(new String[0]);
    }
}
