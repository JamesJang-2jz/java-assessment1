package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        if (k < j){
            return k;
        }
        int count = k / j;
        count += k % j;
        return count;
    }
}
