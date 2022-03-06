package com.michaelmarcal.modernjavainaction.chapter5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

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
    public void test_Mapping() {
        List<Integer> numbers = Arrays.asList( 1, 2, 3, 4, 5 );

        /*
            Given the list of numbers, return a list of the square of each number
         */
        List<Integer> squares = numbers;

        List<Integer> expected = Arrays.asList( 1, 4, 9, 16, 25 );
        Assertions.assertEquals( expected, squares );
    }
}
