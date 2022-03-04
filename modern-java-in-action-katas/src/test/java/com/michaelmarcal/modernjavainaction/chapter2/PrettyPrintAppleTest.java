package com.michaelmarcal.modernjavainaction.chapter2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This Kata has been written around Quiz 2.1 of Modern Java in Action.
 *
 * The quiz from the book uses print rather than returning strings and has been
 * adapted for easier JUnit output assertions here.
 *
 * Write a AppleUtils.prettyPrintApple() method that takes a List of Apples and that can be
 * parameterized with multiple ways to generate a String output from an apple.
 *
 * Note that there are multiple tests below which all call AppleUtils.prettyPrintApple(),
 * so it must be parameterizable to work for all cases.
 */
public class PrettyPrintAppleTest {

    @Test
    @Tag("KATA")
    public void prettyPrintHeavyApplesTest(){
        List<Apple> inventory = getAppleInventory();

        /*
          Implement and call AppleUtils.prettyPrintApple()
          such that heavySizeStrings is a list of String values of the Apple weights.
         */
        List<String> heavySizeStrings = AppleUtils.prettyPrintApple(inventory);

        List<String> expectedHeavySizeStrings = Arrays.asList( "50", "100", "55", "105" );
        Assertions.assertEquals(expectedHeavySizeStrings, heavySizeStrings);
    }

    @Test
    @Tag("KATA")
    public void prettyPrintWeightAndColorApplesTest(){
        List<Apple> inventory = getAppleInventory();

        /*
          Implement and call AppleUtils.prettyPrintApple()
          such that weightAndColorStrings is a list of String values of the Apple weights and
          Colors for all Apples of the form "Color-Weight".  e.g. "RED-50".
         */
        List<String> weightAndColorStrings = AppleUtils.prettyPrintApple(inventory);

        List<String> expectedWeightAndColorStrings = Arrays.asList( "GREEN-50", "GREEN-100", "RED-55", "RED-105" );
        Assertions.assertEquals(expectedWeightAndColorStrings, weightAndColorStrings);
    }

    @Test
    @Tag("KATA")
    public void prettyPrintSentenceTest(){
        List<Apple> inventory = getAppleInventory();

        /*
          Implement and call AppleUtils.prettyPrintApple()
          such that expectedAppleSentenceStrings is a list of String values of the Apple in
          sentence form for all Apples.
          Example sentence: "The GREEN apple weighs 50."
         */
        List<String> appleSentenceStrings = AppleUtils.prettyPrintApple(inventory);

        List<String> expectedAppleSentenceStrings = Arrays.asList(
                "The GREEN apple weighs 50.",
                "The GREEN apple weighs 100.",
                "The RED apple weighs 55.",
                "The RED apple weighs 105."
        );
        Assertions.assertEquals(expectedAppleSentenceStrings, appleSentenceStrings);
    }

    private List<Apple> getAppleInventory(){
        List<Apple> inventory = new ArrayList<>();
        inventory.add( new Apple( 50, Color.GREEN));
        inventory.add( new Apple( 100, Color.GREEN));
        inventory.add( new Apple( 55, Color.RED));
        inventory.add( new Apple( 105, Color.RED));

        return inventory;
    }
}
