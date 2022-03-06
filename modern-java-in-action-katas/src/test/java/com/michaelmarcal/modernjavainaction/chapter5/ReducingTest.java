package com.michaelmarcal.modernjavainaction.chapter5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ReducingTest {

    @Test
    @Tag("KATA")
    public void test_Counts() {
        List<Dish> menu = getDishes();

        /*
            Use map and reduce to count the number of dishes in the stream.
            Note that a List has a size() method which will give the same result, but we don't want to use
            that for this Kata.
         */
        int numberOfDishes = 0;

        int expected = 9;
        Assertions.assertEquals(expected, numberOfDishes);
    }

    private List<Dish> getDishes() {
        return Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH)
        );
    }
}
