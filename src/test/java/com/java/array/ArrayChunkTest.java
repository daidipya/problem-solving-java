package com.java.array;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.java.array.ArrayChunk;


public class ArrayChunkTest {

    @Test
    public void  testChunk(){
        ArrayChunk arrayChunk = new ArrayChunk();
        assertEquals("[1, 2] [3, 4] [5, 6] [7, 8] [9] ",arrayChunk.chunk(new int[]{1,2,3,4,5,6,7,8,9},2));
        assertEquals("[]",arrayChunk.chunk(new int[]{},2));
        assertEquals("[5, 6]",arrayChunk.chunk(new int[]{5,6},4));
        assertEquals("[5, 61]",arrayChunk.chunk(new int[]{5,61},0));
        assertEquals("[5, 6, 3, 4]",arrayChunk.chunk(new int[]{5,6,3,4},-1));

    }

}
