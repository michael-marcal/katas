# Welcome to Modern Java In Action Katas!

## About
While reading Modern Java In Action [(link)](https://www.manning.com/books/modern-java-in-action), there are several 
quizzes to test your understanding of the preceding material.  I've adapted some of these into Katas to test my own 
understanding, and in the interest of sharing, have tried to make these Katas user friendly for others to work through 
as well.

## Technical Details
Each of the Katas defined in PrettyPrintAppleTest are currently failing.  Your job is to implement the code in each 
test method to make each assertion pass.  If you run the test class manually, it will fail.  If you prefer to run 
via `mvn test`, switch the tag from `"KATA"` to `"SOLUTION"` and the test case will be included in the maven build.

## Domain Explanation
For the purpose of this Kata, we will be operating on Apples!  An `Apple` consists of simply a color and a weight.
The Color itself is defined by the enum, `Color`, and the weight is an `int`.  That's it!  

There is also a `AppleUtils` class which can be used to aid in solving the Katas if needed.

## Kata Explanations

### PrettyPrintAppleTest
This Kata has been written around Quiz 2.1 of Modern Java in Action. 

This Kata operates on a List of strings rather than printing to standard out like the book, 
simply to make the assertions easier to verify.

The method ```AppleUtils.prettyPrintApple()``` has been implemented in a default way and needs to be modified to solve the 
Katas.  If desired, the method signature may be changed.

There are 3 test cases in the Kata which all use the same method, ```AppleUtils.prettyPrintApple()```, so a good solution
will implement that method in a way that all 3 cases can be solved with the same implementation.

### FilteringTest
This Kata has been written around Quiz 5.1 of Modern Java in Action.

This Kata operates on a List of Dishes and should be solved using the Streams API.  The domain class of Dish is included
and shouldn't need to be modified for this Kata.

The goal is to return a List of the first 2 MEAT dishes in the original List using the Streams API.

### MappingTest
This Kata has been written around Quiz 5.2 of Modern Java in Action.

It actually has 3 katas built in, which are implemented as 3 test methods explained below:

#### test_Squares
Given a list of integers, return a list of their squares.  

For example, `[1, 2, 3] -> [1, 4, 9]`

#### test_Pairs
Given 2 lists of integers, return a list of all pairs of numbers.  A pair is 1 number from list1, and
another number from list2.  Order doesn't matter, meaning [1, 3] is the same as [3, 1].  The pairs can
be represented as an array of 2 elements.

For example, `[1, 2, 3] [4, 5] -> [[1,4], [1,5], [2,4], [2,5], [3,4], [3,5]`

#### test_PairsDivisibleBy3
This is an extension of test_Pairs above.
Given 2 lists of numbers, return a list of all pairs of numbers whose sum is divisible by 3.
The definition of pair is the same as above.

For example,  `[1, 2, 3] [4, 5] -> [[1,5], [2,4]]`

### ReducingTest
This Kata has been written around Quiz 5.3 of Modern Java in Action.

This Kata operates on a List of Dishes and should be solved using the Streams API.  The domain class of Dish is included
and shouldn't need to be modified for this Kata.

The goal is to return the count of dishes in the stream using `map` and `reduce`.  The List has a size() method,
which will return the same value, but shouldn't be used in this Kata.

### TradersAndTransactionsTest
The Domain consists of Trader and Transaction classes, included. 
The test methods below aim to answer the questions below given a list of Transactions.
The goal is to make the tests pass.  You should not need to modify the Domain classes,
although are free to add any helper classes/methods if desired.

1. Find all transactions in the year 2011 and sort them by value (small to high)
2. What are all the unique cities where the traders work?
3. Find all traders from Cambridge and sort them by name.
4. Return a string of all traders' names sorted alphabetically.
5. Are any traders based in Milan?
6. Return the values of all transactions from the traders living in Cambridge.
7. What's the highest value of all the transactions?
8. Find the transaction with the smallest value.