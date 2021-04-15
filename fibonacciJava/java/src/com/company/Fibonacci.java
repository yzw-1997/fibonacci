package com.company;

public class Fibonacci {
    public static int valueOfIndex(int index) {
        int value = 0;

        if (index < 0){
            throw new IllegalArgumentException("index must be non-negative.");
        }

        if (index == 0 || index == 1){
            value = index;
        }

        if (index > 1 && index <= 46){
           int preOne = 1;
           int preTwo = 0;
           for (int i = 2; i <= index; i++){
               value = preOne + preTwo;
               preTwo = preOne;
               preOne = value;
           }
        }

        if (index >= 47){
            throw new IllegalArgumentException("index is too big.");
        }

        return value;
    }
}