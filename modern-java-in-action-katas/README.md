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