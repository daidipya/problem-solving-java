package com.java.string;

/**
 * Problem Statement :
 *
 *
 */
public class Palindrome {

    /**
     * Method to check whether input string is palindrome or not using
     * reverse method of class StringBuilder.
     * @param String input
     * @return boolean flag
     */
    public boolean isPalindrome1(String input){
        if(input == null )return false;
        return  new StringBuilder(input).reverse().toString().equals(input);
    }

    /**
     * Method to check whether input string is palindrome or not using
     * charAt function of string class.
     * @param String input
     * @return boolean flag
     */
    public boolean isPalindrome2(String input){
        if(input == null )return false;
        int length = input.length();
        for(int i=0;i< length ;i++){
            if(input.charAt(i)!=input.charAt(length-1-i)){
                return false;
            }
        }
        return true;
    }

}
