package com.java.string;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class FizzBuzzTest {

    @Test
    public  void  testFizzBuzz(){
        FizzBuzz fb = new FizzBuzz();
        assertEquals("1 2 Fizz " , fb.fizzBuzz(3));
        assertEquals("1 2 Fizz 4 Buzz Fizz " , fb.fizzBuzz(6));
        assertEquals("" , fb.fizzBuzz(0));
        assertEquals("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 " , fb.fizzBuzz(16));
    }

}
