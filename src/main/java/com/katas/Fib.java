package com.katas;

public class Fib {
  public static int fib(int i) {
    int sum = 0;
    for(int tmp, prev = 1; i > 0; i--) {
      tmp = sum;
      sum += prev;
      prev = tmp;
    }
    return sum;
  }
}
