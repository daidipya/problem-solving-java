package com.java.string;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;


public class PalindromeTest {

    static  Palindrome palindrome;
    @BeforeClass
    public static void init(){
        palindrome = new Palindrome();
    }

    @Test
    public void testIsPalindrome1(){
        assert(palindrome.isPalindrome1("aa"));
        assert(palindrome.isPalindrome1("abba"));
        assertEquals(false,palindrome.isPalindrome1("abbfa"));
        assertEquals(false,palindrome.isPalindrome1(null));
    }

    @Test
    public void testIsPalindrome2(){
        assert(palindrome.isPalindrome2("aa"));
        assert(palindrome.isPalindrome2("abba"));
        assertEquals(false,palindrome.isPalindrome2("abbfa"));
        assertEquals(false,palindrome.isPalindrome2(null));
    }
}
