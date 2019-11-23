package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]` such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues) {
        Arrays.sort(inputArray);
        Arrays.sort(squaredValues);
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] * inputArray[i] != squaredValues[i]) {
                return false;
            }
        }
        return true;
    }

//        return (IntStream.range(0, inputArray.length).filter(i -> inputArray[i] * inputArray[i] != squaredValues[i]).count()) == 0;
//        what i originally had. ^ only passed 4 tests.
}
