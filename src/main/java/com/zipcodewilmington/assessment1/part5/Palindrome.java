package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        Integer count = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                StringBuilder sb = new StringBuilder();
                sb.append(input.substring(i,j));
                if (sb.toString().equals(sb.reverse().toString())){
                    count++;
                }
            }
        }
        return count;
    }
}
