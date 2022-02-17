# Welcome to my My First Kata!

## About
This is a very straightforward Kata which focuses on a few List manipulations.  The goal here was to get the project set
up, rather than explore any overly interesting algorithms or concepts.  Stay tuned for more!

## Technical Details
Each of the 3 Katas defined in ListTest are currently failing.  Your job is to implement the code in each test method to
make each assertion pass.  If you run the test class manually, it will fail.  If you prefer to run via `mvn test`, switch
the tag from `"KATA"` to `"SOLUTION"` and the test case will be included in the maven build.

## Kata Explanations

### reverseList
This is a simple list reverse exercise.  Given the input list of strings, reverse the order.  There are no restrictions
on space, time, nor libraries used, so feel free to experiment with different solutions.

### sortList
This is a simple list sort exercise.  Given a list of integers, there are 2 assertions.  First to sort the list in ascending 
order, and then sort it in descending order.  Again, there are no restrictions on time, space, nor libraries.

### sortListCustom
Finally, this is similar to `sortList` above, but the input are string representations of integers.  The sort needs to be 
in ascending order of the integer representation of the list of strings.  Again, there are no restrictions on time, 
space, nor libraries.