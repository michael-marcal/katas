package com.michaelmarcal.modernjavainaction.chapter5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * This Kata has been written around Chapter 5.6 of Modern Java in Action.
 *
 * The Domain consists of Trader and Transaction classes, included.
 * The test methods below aim to answer the questions below given a list of Transactions.
 * The goal is to make the tests pass.  You should not need to modify the Domain classes,
 * although are free to add any helper classes/methods if desired.
 *
 *   1. Find all transactions in the year 2011 and sort them by value (small to high)
 *   2. What are all the unique cities where the traders work?
 *   3. Find all traders from Cambridge and sort them by name.
 *   4. Return a string of all traders' names sorted alphabetically.
 *   5. Are any traders based in Milan?
 *   6. Return the values of all transactions from the traders living in Cambridge.
 *   7. What's the highest value of all the transactions?
 *   8. Find the transaction with the smallest value.
 *
 **/
public class TradersAndTransactionsTest {

    // Question 1
    @Test
    @Tag("KATA")
    public void test_2011Transactions() {
        List<Transaction> transactions = getTransactions();

        /*
            Find all transactions in the year 2011 and sort them by value (small to high)
         */
        List<Transaction> result = transactions;

        List<Transaction> expected = Arrays.asList(
                new Transaction(new Trader( "Brian", "Cambridge" ), 2011, 300 ),
                new Transaction(new Trader( "Raoul", "Cambridge" ), 2011, 400 )
        );
        Assertions.assertEquals(expected, result);
    }

    // Question 2
    @Test
    @Tag("KATA")
    public void test_uniqueCities() {
        List<Transaction> transactions = getTransactions();

        /*
            Find the unique cities where the traders work?
         */
        List<String> uniqueCities = new ArrayList<>();

        List<String> expected = Arrays.asList( "Cambridge", "Milan" );
        // Order doesn't matter.
        Assertions.assertEquals(new HashSet<>(expected), new HashSet<>(uniqueCities));
    }

    // Question 3
    @Test
    @Tag("KATA")
    public void test_CambridgeTraders(){
        List<Transaction> transactions = getTransactions();

        /*
            Find all traders from Cambridge and sort them by name.
         */
        List<Trader> traders = new ArrayList<>();

        List<Trader> expected = Arrays.asList(
                new Trader( "Alan", "Cambridge" ),
                new Trader( "Brian", "Cambridge" ),
                new Trader( "Raoul", "Cambridge" )
        );
        Assertions.assertEquals(expected, traders);
    }

    // Question 4
    @Test
    @Tag("KATA")
    public void test_Traders() {
        List<Transaction> transactions = getTransactions();

        /*
            Find a string of all traders' names sorted alphabetically.
         */
        List<String> traders = new ArrayList<>();

        List<String> expected = Arrays.asList( "Alan", "Brian", "Mario", "Raoul" );
        Assertions.assertEquals(expected, traders);
    }

    // Question 5
    @Test
    @Tag("KATA")
    public void test_MilanTraders() {
        List<Transaction> transactions = getTransactions();

        /*
            Are any traders based in Milan?
         */
        boolean isMilanTradersExist = false;

        boolean expected = true;
        Assertions.assertEquals(expected, isMilanTradersExist);
    }

    // Question 6
    @Test
    @Tag("KATA")
    public void test_CambridgeTransactions() {
        List<Transaction> transactions = getTransactions();

        /*
            Find the values of all transactions from the traders living in Cambridge.
         */
        List<Integer> values = new ArrayList<>();

        List<Integer> expected = Arrays.asList( 300, 1000, 400, 950);
        // Order doesn't matter.
        Assertions.assertEquals(new HashSet<>(expected), new HashSet<>(values));
    }

    // Question 7
    @Test
    @Tag("KATA")
    public void test_MaxTransactionValue() {
        List<Transaction> transactions = getTransactions();

        /*
            Find the highest value of all the transactions.
         */
        int maxValue = Integer.MIN_VALUE;

        int expected = 1000;
        Assertions.assertEquals(expected, maxValue);
    }

    // Question 8
    @Test
    @Tag("KATA")
    public void test_MinTransactionValue() {
        List<Transaction> transactions = getTransactions();

        /*
            Find the transaction with the smallest value.
         */
        Transaction minTransaction = null;

        Transaction expected = new Transaction(new Trader("Brian", "Cambridge"), 2011, 300);
        Assertions.assertEquals(expected, minTransaction);
    }

    private List<Transaction> getTransactions() {
        Trader raoul = new Trader( "Raoul", "Cambridge" );
        Trader mario = new Trader( "Mario", "Milan" );
        Trader alan = new Trader( "Alan", "Cambridge" );
        Trader brian = new Trader( "Brian", "Cambridge" );
        return Arrays.asList(
                new Transaction(brian, 2011, 300 ),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400 ),
                new Transaction(mario, 2012, 710 ),
                new Transaction(mario, 2012, 700 ),
                new Transaction(alan, 2012, 950 )
        );
    }

}
