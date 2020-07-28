package com.java.string;

/**
 * Problem Statement :Given a string , return a character  that is most commonly used.
 *  Example : 1. Input  -> abaaba , Output ->a
 *  Example : 2. Input  -> sddd , Output -> -d
 */


public class FizzBuzz {

    String spaceSeparator =" ";

    public  String fizzBuzz(int number){

        StringBuilder sb = new StringBuilder();

        for(int i=1;i<=number ;i++){

            String outString = Integer.toString(i);

            boolean isDivisibleByThree=false;
            boolean isDivisibleByFive=false;
            if(i%3==0){
                isDivisibleByThree =true;
                outString="Fizz";
            }
            if(i%5==0){
                isDivisibleByFive=true;
                outString="Buzz";
            }
            if(isDivisibleByFive && isDivisibleByThree) outString="FizzBuzz";
            sb.append(outString).append(spaceSeparator);
        }

        return sb.toString();

    }
}
