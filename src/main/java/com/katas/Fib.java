package com.katas;

public class Fib {
    public static int fib(final int i) {
        if (i < 1) {
            throw new IllegalArgumentException();
        }
        int result = 0;
        for(int prev = 1, n = i; n > 0; n--) {
            result = prev + (prev = result);
            if(prev > result) {
                throw new IllegalArgumentException("fib(" + i + ") is overflowed");
            }
        }
        return result;
    }
}
