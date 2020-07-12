package com.katas;

public class Fib {
  public static int fib(int i) {
    int sum = 0;
    for(int prev = 1; i > 0; i--) {
      sum = prev + (prev = sum);
    }
    return sum;
  }
}
