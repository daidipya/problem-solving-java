package com.java.array;

import java.util.Arrays;


/**
 * Problem Statement :Given a array and chunk size, divide the array into  many sub array
 * where each sub array its of length size
 * most commonly
 * used.
 *  Example : 1. Input  -> ([1,2,3,4,5],2) , Output ->[1,2] [3,4] [5]
 *  Example : 2. Input  -> ([1,2,3,4,5],10), Output ->[1,2,3,4,5]
 */

public class ArrayChunk {

    public  String chunk(int[] inputArr ,int chunkSize){

        String spaceSeparator =" ";
        StringBuilder sb = new StringBuilder();
        int arraySize = inputArr.length;

        if(arraySize<chunkSize|| chunkSize<=0) {
            sb.append(Arrays.toString(inputArr));
        }else {
            for (int i = 0; i < inputArr.length; i = i + chunkSize) {
                sb.append(Arrays.toString(Arrays.copyOfRange(inputArr, i, Math.min(arraySize, i + chunkSize))))
                        .append(spaceSeparator);
            }
        }

        return sb.toString();
    }
}
