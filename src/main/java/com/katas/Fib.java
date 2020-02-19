package com.katas;

public class Fib {
  public static int fib(int n) {
    int sum = 1;
    for(int prev = 1; n > 2; n--) {
      sum += prev;
    }
    return sum;
  }
}
