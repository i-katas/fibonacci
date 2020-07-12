package com.katas;

public class Fib {
    public static int fib(final int i) {
        if (i < 1) {
            throw new IllegalArgumentException();
        }
        int sum = 0;
        for(int prev = 1, n = i; n > 0; n--) {
            sum = prev + (prev = sum);
            if(prev > sum) {
                throw new IllegalArgumentException("fib(" + i + ") is overflowed");
            }
        }
        return sum;
    }
}
