package com.zipcodewilmington.assessment1.part1;
public class IntegerUtils {

    public static Integer getSumOfN(Integer n) {
        Integer sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        Integer sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        Integer result = 0;
        while (val != 0){
            int digit = val % 10;
            result = result * 10 + digit;
            val /= 10;
        }
        return result;
    }
}
