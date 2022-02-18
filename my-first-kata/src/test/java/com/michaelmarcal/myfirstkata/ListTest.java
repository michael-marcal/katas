package com.michaelmarcal.myfirstkata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListTest {

    @Test
    @Tag("KATA")
    public void reverseList() {
        List<String> myList = Arrays.asList("one", "two", "three", "four", "five");

        // Reverse myList.

        List<String> expected = Arrays.asList( "five", "four", "three", "two", "one" );
        Assertions.assertEquals( expected, myList );
    }

    @Test
    @Tag("KATA")
    public void sortList() {
        List<Integer> myList = Arrays.asList(2, 5, 1, 9, 3);

        // Sort list ascending


        List<Integer> expectedAsc = Arrays.asList(1, 2, 3, 5, 9);
        Assertions.assertEquals(expectedAsc, myList);

        // Sort list descending

        List<Integer> expectedDesc = Arrays.asList(9, 5, 3, 2, 1);
        Assertions.assertEquals(expectedDesc, myList);
    }

    @Test
    @Tag("KATA")
    public void sortListCustom() {
        List<String> myList = Arrays.asList("2", "5", "1", "4", "3");

        // Sort list ascending by the string's integer value.  i.e. "two" = 2.

        List<String> expected = Arrays.asList("1", "2", "3", "4", "5");
        Assertions.assertEquals(expected, myList);
    }
}
