package com.zipcodewilmington.assessment1.part1;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        return Arrays.stream(intArray).mapToInt(Integer::intValue).sum();
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        return Arrays.stream(intArray).reduce(1,(x,y) -> x*y);
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        return Arrays.stream(intArray).mapToDouble(Integer::doubleValue).average().orElse(0.0);
    }
}
