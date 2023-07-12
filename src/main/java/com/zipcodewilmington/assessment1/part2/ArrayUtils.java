package com.zipcodewilmington.assessment1.part2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayUtils {

    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer count = 0;
        for (Object o : objectArray) {
            if (o == objectToCount){
                count++;
            }
        }
        return count;
    }

    public static <T> T[] removeValue(T[] objectArray, T objectToRemove) {
        List<T> list = new ArrayList<>();
        for (T obj : objectArray) {
            if (!obj.equals(objectToRemove)) {
                list.add(obj);
            }
        }
        return list.toArray((T[]) Array.newInstance(objectArray.getClass().getComponentType(), list.size()));
    }

    public static Object getMostCommon(Object[] objectArray) {
        Object obj;

        return null;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        return null;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        return null;
    }
}
