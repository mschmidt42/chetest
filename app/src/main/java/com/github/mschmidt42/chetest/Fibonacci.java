package com.github.mschmidt42.chetest;

public class Fibonacci {
    public static String getFibonacci(int count){
        int i=0;
        int value=0;
        String result = "";
        for(i=0; i < count; ++i){
            value +=i;
            result = result + value + "  ";
        }
        return result;
    }
}