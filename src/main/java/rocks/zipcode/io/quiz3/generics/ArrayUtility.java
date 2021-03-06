package rocks.zipcode.io.quiz3.generics;

import java.util.Arrays;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<T> {
    private final T[] array;

    public ArrayUtility(T[] array) {
        this.array = array;
    }

    public T findOddOccurringValue() {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j])
                    count++;
            }
            if (count % 2 != 0)
                return array[i];
        }
        return null;
    }


    public T findEvenOccurringValue() {

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j])
                    count++;
            }
            if (count % 2 == 0)
                return array[i];
        }
        return null;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        Integer count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == valueToEvaluate){
                count++;
            }
        }
        return count;
    }

    public T[] filter(Function<T, Boolean> predicate) {
        return Arrays.stream(array).filter(predicate::apply).toArray(size -> Arrays.copyOf(array, size));
    }
}
