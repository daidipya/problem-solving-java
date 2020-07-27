package com.java.string;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;


public class IntegerReversalTest {

    public static  IntegerReversal integerReversal ;

    @BeforeClass
    public static void init(){
      integerReversal = new IntegerReversal();
    }

    @Test
    public void testReverseInt(){
        assertEquals(4321 , integerReversal.reverseInt(1234));
        assertEquals(111 , integerReversal.reverseInt(111));
        assertEquals(0 , integerReversal.reverseInt(0));
        assertEquals(-4342 , integerReversal.reverseInt(-2434));
        assertEquals( 21, integerReversal.reverseInt(120));
        assertEquals( 20021, integerReversal.reverseInt(120020));
        assertEquals( -2, integerReversal.reverseInt(-2000));
    }
}
