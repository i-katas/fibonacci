package com.katas;

import org.junit.Test;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import static com.katas.Fib.fib;

public class FibTest {
  @Test
  public void return1ForTheFirstTwoIndecies() throws Throwable {
    assertThat(fib(1), equalTo(1));
    assertThat(fib(2), equalTo(1));
  }

  @Test
  public void sumOfPrevious2IndicesResultIfIndexLargeThan2() throws Throwable {
    assertThat(fib(3), equalTo(2));
    assertThat(fib(4), equalTo(3));
    assertThat(fib(5), equalTo(5));
  }

  @Test
  public void throwsExceptionIfIndexLessThan1() throws Throwable {
    assertThrows(IllegalArgumentException.class, () -> fib(0));
  }
}
