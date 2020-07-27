package com.java.string;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class MaxCharsTest {



    @Test
    public void testMaxChars1(){
    MaxChars maxChars = new MaxChars();

    assertEquals('a',maxChars.maxChar1("aaaaasb"));
    assertEquals('1',maxChars.maxChar1("aabbb1111111122211111aaasb"));

    }

    @Test
    public void testMaxChars2(){
        MaxChars maxChars = new MaxChars();

        assertEquals('a',maxChars.maxChar2("aaaaasb"));
        assertEquals('1',maxChars.maxChar2("aabbb1111111122211111aaasb"));

    }

}

