package com.company.test;

import com.company.Fibonacci;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {
    Fibonacci fibonacci = new Fibonacci();

    @Test( expected = java.lang.IllegalArgumentException.class)
    public void testValueOfIndex() {
        assertEquals(1,Fibonacci.valueOfIndex(-1));
        assertEquals(1,Fibonacci.valueOfIndex(0));
        assertEquals(1, Fibonacci.valueOfIndex(1));
        assertEquals(1, Fibonacci.valueOfIndex(2));
        assertEquals(13, Fibonacci.valueOfIndex(7));
    }
}