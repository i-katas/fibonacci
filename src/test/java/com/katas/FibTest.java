package com.katas;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import static com.katas.Fib.fib;

public class FibTest {
  @Test
  public void fixNumbers() throws Throwable {
    assertThat(fib(1), equalTo(1));
  }
}
