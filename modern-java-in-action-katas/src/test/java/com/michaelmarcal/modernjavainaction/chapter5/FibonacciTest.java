package com.michaelmarcal.modernjavainaction.chapter5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  This Kata has been written around Quiz 5.4 of Modern Java in Action.
 *
 *  Fibonacci Tuple Series
 *
 *  The series of Fibonacci Tuples is similar to the Fibonacci series.
 *  Starting with (0,1), the series is a number and its successor in the Fibonacci series.
 *  0 is the first number in the Fibonacci series, and 1 is its successor, hence (0,1).
 *  1 is the next number in the Fibonacci series, and 1 is its successor, so (1,1).
 *  Ex. (0,1),(1,1),(1,2),(2,3),(3,5),(5,8)...
 *
 *  Using an int[] to represent a tuple create a list of the first 20 tuples in the Fibonacci Tuple series
 *  using Stream.iterate().
 *
 */
public class FibonacciTest {

    @Test
    @Tag("KATA")
    public void test_FibonacciTuples() {
        List<int []> tuples = new ArrayList<>();

        List<int []> expected = Arrays.asList(
                new int[]{0,1}, new int[]{1,1}, new int[]{1,2}, new int[]{2,3}, new int[]{3,5}, new int[]{5,8},
                new int[]{8,13}, new int[]{13,21}, new int[]{21,34}, new int[]{34,55}, new int[]{55,89},
                new int[]{89,144}, new int[]{144,233}, new int[]{233,377}, new int[]{377,610}, new int[]{610,987},
                new int[]{987,1597}, new int[]{1597,2584}, new int[]{2584,4181}, new int[]{4181,6765}
        );
        Assertions.assertArrayEquals(expected.toArray(), tuples.toArray());
    }
}
