package com.zipcodewilmington.assessment1.part2;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        Map<Object, Integer> map = new HashMap<>();
        for (Object e : objectArray) {
            map.put(e, map.getOrDefault(e, 0) + 1);
        }
        Object result = null;
        int max = 0;
        for (Map.Entry<Object, Integer> entry: map.entrySet()) {
            Object obj = entry.getKey();
            int count = entry.getValue();
            if (count > max) {
                result = obj;
                max = count;
            }
        }
        return result;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Map<Object, Integer> map = new HashMap<>();
        for (Object e : objectArray) {
            map.put(e, map.getOrDefault(e, 0) + 1);
        }
        Object result = null;
        int min = Integer.MAX_VALUE;
        for (Map.Entry<Object, Integer> entry: map.entrySet()) {
            Object obj = entry.getKey();
            int count = entry.getValue();
            if (count < min) {
                result = obj;
                min = count;
            }
        }
        return result;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */

    public static <T> T[] mergeArrays(T[] objectArray, T[] objectArrayToAdd) {
        Object[] a = objectArray;
        Object[] b = objectArrayToAdd;
        T[] n = (T[]) Array.newInstance(a.getClass().getComponentType(), a.length + b.length);
        System.arraycopy(a, 0, n, 0, a.length);
        System.arraycopy(b, 0, n, a.length, b.length);
        return n;
//        return Stream.of(objectArray,objectArrayToAdd)
//                .flatMap(Stream::of)
//                .toArray(size -> (T[]) Array.newInstance(objectArray.getClass().getComponentType(), size));
    }
}
