package com.katas;

public class Fib {
  public static int fib(int n) {
    int sum = 0;
    for(int tmp, prev = 1; n > 0; n--) {
      tmp = sum;
      sum += prev;
      prev = tmp;
    }
    return sum;
  }
}
