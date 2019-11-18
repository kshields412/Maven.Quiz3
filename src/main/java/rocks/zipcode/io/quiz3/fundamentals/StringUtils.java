package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char[] newStr = str.toCharArray();
        newStr[indexToCapitalize] = Character.toUpperCase(newStr[indexToCapitalize]);
        return new String(newStr);
    }


    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        for(int i = 0; i < baseString.length(); i++){
            if(baseString.toCharArray()[indexOfString] == characterToCheckFor){
                return true;
            }
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        int count = string.length() * (string.length() + 1) / 2;
        ArrayList<String> substrings = new ArrayList<>(count);

        for(int i = 0;i < string.length();i++) {
            for (int j = i + 1; j <= string.length(); j++) {
//                if(string[i] == )
                substrings.add(string.substring(i, j));
            }
        }
        return substrings.toArray(new String[substrings.size()]);
    }

            public static Integer getNumberOfSubStrings (String input){
                int count = input.length() * (input.length() + 1) / 2;
                int subCount = -1;
                ArrayList<String> substrings = new ArrayList<>(count);

                for(int i = 0; i < input.length(); i++) {
                    for (int j = i + 1; j <= input.length(); j++) {
                            substrings.add(input.substring(i, j));
                            subCount++;
                    }
                }
                return subCount;
            }
        }

