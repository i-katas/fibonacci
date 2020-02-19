package com.katas;

public class Fib {
  public static int fib(int n) {
    int sum = 1;
    while(n-- > 2) {
      sum++;
    }
    return sum;
  }
}
