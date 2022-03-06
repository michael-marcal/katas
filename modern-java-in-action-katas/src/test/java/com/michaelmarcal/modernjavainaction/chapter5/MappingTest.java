package com.michaelmarcal.modernjavainaction.chapter5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This Kata has been written around Quiz 5.2 of Modern Java in Action.
 *
 * Given a list of numbers, return a list of the square of each number.
 **/
public class MappingTest {

    @Test
    @Tag("KATA")
    public void test_Squares() {
        List<Integer> numbers = Arrays.asList( 1, 2, 3, 4, 5 );

        /*
            Given the list of numbers, return a list of the square of each number
         */
        List<Integer> squares = numbers;

        List<Integer> expected = Arrays.asList( 1, 4, 9, 16, 25 );
        Assertions.assertEquals( expected, squares );
    }

    @Test
    @Tag("KATA")
    public void test_Pairs() {
        List<Integer> list1 = Arrays.asList( 1, 2, 3 );
        List<Integer> list2 = Arrays.asList( 3, 4 );

        /*
            Given 2 lists of numbers, return a list of all pairs of numbers.  A pair is 1 number from list1, and
            another number from list2.  Order doesn't matter, meaning [1, 3] is the same as [3, 1].  The pairs can
            be represented as an array of 2 elements.
         */
        List<int[]> result = new ArrayList<>();

        List<int[]> expected = Arrays.asList(new int[]{1,3}, new int[] {1,4}, new int[] {2,3},
                new int[] {2,4}, new int[] {3,3}, new int[] {3,4});
        assertPairsAreEqual(expected, result);
    }

    @Test
    @Tag("KATA")
    public void test_PairsDivisibleBy3() {
        List<Integer> list1 = Arrays.asList( 1, 2, 3 );
        List<Integer> list2 = Arrays.asList( 3, 4 );

        /*
            This is an extension of test_Pairs above.
            Given 2 lists of numbers, return a list of all pairs of numbers whose sum is divisible by 3.
            The definition of pair is the same as above.
         */
        List<int[]> result = new ArrayList<>();

        List<int[]> expected = Arrays.asList(new int[] {2,4}, new int[] {3,3});
        assertPairsAreEqual(expected, result);
    }

    private void assertPairsAreEqual( List<int[]> expected, List<int[]> result ) {
        Assertions.assertEquals(expected.size(), result.size());
        for (int i = 0; i < expected.size(); i++) {
            Assertions.assertArrayEquals(expected.get(i), result.get(i));
        }
    }
}
