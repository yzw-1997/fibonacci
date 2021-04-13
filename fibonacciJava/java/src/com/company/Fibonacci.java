package com.company;

public class Fibonacci {
    public static int valueOfIndex(int index) {
        if (index < 0){
            throw new IllegalArgumentException("index must be greater than 0.");
        }

        if (index <= 1) {
            return index;
        }

        int value = 1;
        int preOne = 1;
        int preTwo = 0;
        for (int i = 2; i <= index; i++){
            value = preOne + preTwo;
            if (value < 0){
                throw new RuntimeException("index is too  big");
            }
            preTwo = preOne;
            preOne = value;
        }
        return value;
    }
}