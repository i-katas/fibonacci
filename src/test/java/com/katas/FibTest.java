package com.katas;

import org.junit.Test;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertThat;
import static org.junit.internal.matchers.ThrowableMessageMatcher.hasMessage;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.containsString;

import static com.katas.Fib.fib;

public class FibTest {
    @Test
    public void return1ForTheFirstTwoIndecies() throws Throwable {
        assertThat(fib(1), equalTo(1));
        assertThat(fib(2), equalTo(1));
    }

    @Test
    public void sumOfPrevious2IndicesResultIfIndexLargeThan2() throws Throwable {
        assertThat(fib(3), equalTo(fib(1) + fib(2)));
        assertThat(fib(4), equalTo(fib(2) + fib(3)));
        assertThat(fib(5), equalTo(fib(3) + fib(4)));
    }

    @Test
    public void throwsExceptionIfIndexLessThan1() throws Throwable {
        assertThrows(IllegalArgumentException.class, () -> fib(0));
    }

    @Test
    public void throwsExceptionIfResultOverflowed() throws Throwable {
        Exception expected = assertThrows(IllegalArgumentException.class, () -> fib(47));
        assertThat(expected, hasMessage(containsString("fib(47) is overflowed")));
    }
}
