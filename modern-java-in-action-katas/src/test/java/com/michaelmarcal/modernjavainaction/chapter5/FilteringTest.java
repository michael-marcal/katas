package com.michaelmarcal.modernjavainaction.chapter5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

/**
 * This Kata has been written around Quiz 5.1 of Modern Java in Action.
 *
 * The Domain class of Dish has been included, and shouldn't need modification.
 * The challenge is to use Java Streams to filter the first 2 meat dishes in
 * the provided collection.
 *
 **/
public class FilteringTest {

    @Test
    @Tag("KATA")
    public void test_Filtering() {
        List<Dish> menu = getDishes();

        /*
            Use Streams to filter the first two meat dishes.
         */
        List<Dish> dishes = menu;

        List<Dish> expected = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT)
        );
        Assertions.assertEquals(expected, dishes);
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
