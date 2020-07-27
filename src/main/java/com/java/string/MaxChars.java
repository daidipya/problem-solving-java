package com.java.string;

import java.util.HashMap;
import java.util.Map;


/**
 * Problem Statement :Given a string , return a character  that is most commonly used.
 *  Example : 1. Input  -> abaaba , Output ->a
 *  Example : 2. Input  -> sddd , Output -> -d
 */
public class MaxChars {

    public char maxChar1(String inputString) {

        int[] charArr = new int[256];
        for (int i = 0; i < inputString.length(); i++) {
            charArr[inputString.charAt(i)]++;
        }
        int maxCharCount = -1, maxCharIndex = 0;
        for (int i = 0; i < 256; i++) {
            if (charArr[i] > maxCharCount) {
                maxCharCount = charArr[i];
                maxCharIndex = i;
            }
        }
        return (char) maxCharIndex;
    }

    public char maxChar2(String inputString){

        Map<Character,Integer> charMap = new HashMap<>();
        for(char c : inputString.toCharArray()){
            Integer charCount = charMap.get(c);
            if (charCount == null) {
                charMap.put(c, 1);
            } else {
                charMap.put(c, charCount+ 1);
            }
        }
        int maxCharCount =-1;
        char maxChar = 0;
        for(Map.Entry<Character,Integer> entry : charMap.entrySet()){
            if(entry.getValue()>maxCharCount) {
                maxCharCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        return  maxChar;
    }


}
