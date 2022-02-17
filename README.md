# Welcome to my Katas!

## About
In an effort to practice coding, I've set up a repository to house some of my code katas that I develop over time.
The contents of this repository will generally be a collection of code katas built using Java 17, although not necessarily
strictly requiring Java 17 nor working through Java 17-specific features.  At the time of initialization, 17 was the latest
LTS Java version.  Where I find it appropriate, I will include a write-up for particular exercises on the [Blog](www.michaelmarcal.com).

## Technical Details
This project is organized as a top level maven module with individual modules per kata.
Within each kata module, under the /test/java/com/michaelmarcal directory, there is the kata implemented as a failing JUnit test(s).  In order to allow for successful 
builds despite failing tests, the kata tests are tagged as `"KATA"` which are ignored during the maven test goal.
To run all tests tagged as `"SOLUTION"` automatically, via maven, use the following command:
```Shell
mvn test
```

It is suggested that given a kata test example like below:
```Java
@Test
@Tag("KATA")
public void testExample() {
    Integer i = 10;
    // Increment i by 1.

    Integer expected = 11;
    Assertions.assertEquals(expected, i);
}
```

Switch the tag to `"SOLUTION"` and implement the solution to get the mvn test goal to include the test.
```Java
@Test
@Tag("SOLUTION")
public void testExample() {
    Integer i = 10;
    // Increment i by 1.
    i++;
    
    Integer expected = 11;
    Assertions.assertEquals(expected, i);
}
```

Supporting code will be housed in /src/main/java/com/michaelmarcal/ directory of the same module, where necessary.

##Katas
Documentation to individual Katas will be included here.

* [My First Kata](my-first-kata/README.md)


## SDK
This project uses OpenJDK 17.0.2.

## IDE
This project was developed in IntelliJ Community version.  SDK can be set in Module settings in IntelliJ to run using
in addition to the maven goals identified above.  It shouldn't be limited to IntelliJ developement though as it's simply
a maven project.