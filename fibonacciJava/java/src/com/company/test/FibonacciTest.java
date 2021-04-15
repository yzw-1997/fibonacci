package com.company.test;

import com.company.Fibonacci;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_when_index_less_than_0(){
        Fibonacci.valueOfIndex(-1);
    }

    @Test
    public void should_return_0_when_index_is_0(){
        assertEquals(0, Fibonacci.valueOfIndex(0));
    }

    @Test
    public void should_return_1_when_index_is_1(){
        assertEquals(1, Fibonacci.valueOfIndex(1));
    }

    @Test
    public void should_return_correct_value_when_index_between_2_and_46(){
        assertEquals(1, Fibonacci.valueOfIndex(2));
        assertEquals(55, Fibonacci.valueOfIndex(10));
        assertEquals(1836311903, Fibonacci.valueOfIndex(46));
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_when_index_more_than_46(){
        Fibonacci.valueOfIndex(47);
    }
}