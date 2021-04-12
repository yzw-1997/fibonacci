package com.company;

import java.util.ArrayList;

public class Fibonacci {
    public static int valueOfIndex(int index) {

        if (index <= 0){
            throw new IllegalArgumentException("index must be greater than 0.");
        }

        int value = 1;

        if (index <= 2) {
            return value;
        }

        value = Fibonacci.valueOfIndex(index - 1) + Fibonacci.valueOfIndex(index - 2);
        return value;
    }
}