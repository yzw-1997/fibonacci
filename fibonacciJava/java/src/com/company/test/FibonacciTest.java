package com.company.test;

import com.company.Fibonacci;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {
    Fibonacci fibonacci = new Fibonacci();

    @Rule public ExpectedException thrown = ExpectedException.none();
    @Test( expected = java.lang.IllegalArgumentException.class)
    public void testValueOfIndex() {
        Fibonacci.valueOfIndex(-1);
        assertEquals(0,Fibonacci.valueOfIndex(0));
        assertEquals(1, Fibonacci.valueOfIndex(1));
        assertEquals(13, Fibonacci.valueOfIndex(7));
        thrown.expect(RuntimeException.class);
        Fibonacci.valueOfIndex(2147483646);
        Fibonacci.valueOfIndex(2147483647);
    }
}