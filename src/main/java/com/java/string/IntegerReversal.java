package com.java.string;

/**
 * Problem Statement :Given an integer , return an integer that is reverse ordering of numbers
 *  Example : 1. Input  -> 12 , Output ->21
 *  Example : 2. Input  -> -12 , Output -> -21
 *  Example : 3. Input  -> 120 , Output -> 21
 *  Example : 4. Input  -> 2000 , Output -> 2
 */
public class IntegerReversal {

    public  int reverseInt(int inputNumber) {
        if(inputNumber==0)return 0;
        int absInputNumber = Math.abs(inputNumber);
        return (inputNumber / absInputNumber) * Integer
                .valueOf(new StringBuilder(Integer.toString(absInputNumber)).reverse().toString());
    }
}
