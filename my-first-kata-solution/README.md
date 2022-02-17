# Welcome to my My First Kata Solution!

I'd encourage you to work through the [Kata](https://github.com/michael-marcal/katas/blob/87c7265c6adfd9ed8cb223ebe119284c3fe61bf5/my-first-kata/README.md)
on your own before referencing the solutions 
implemented in this module.  As mentioned, the purpose of this Kata was to get a project and framework set up for easily 
adding future Katas.  As such, the exercises themselves are quite basic.  Regardless, that doesn't mean the solutions
need to be!  Remember, there is not only one solution to any problem.  The below are ones I developed and like, but
by no means are they the best.

## Solutions

### reverseList
For this Kata, to reverse a list of strings, I used the Collections utilities.  Conveniently, there already is a `reverse()`
[static method implemented](https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html#reverse(java.util.List))
, which runs in linear time.  It's always nice when the hard work is done for us :).

## sortList
For this solution, to sort the list of integers, I also used the Collections utilities.  The default 
[sort](https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html#sort(java.util.List))
is ascending, and 
then I used the `reverseOrder()` [comparator](https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html#reverseOrder())
to get it in descending order.

## sortListCustom
For this solution, we can't rely on the basic sort comparator, because the list is composed of strings.  Thus I used a 
custom Comparator to parse the string value to its integer equivalent.  This ensures the sort will be based upon the 
numerical value instead of its string value being sorted alphabetically.