# Welcome to my Katas!

## About
In an effort to practice coding, I've set up a repository to house some of my code katas that I develop over time.
The contents of this repository will generally be a collection of code katas built using Java 17, although not necessarily
strictly requiring Java 17 nor working through Java 17-specific features.  At the time of initialization, 17 was the latest
Java version.  Where I find it appropriate, I will include a write-up for particular exercises on the [Blog](www.michaelmarcal.com).

## Technical Details
As of now (Feb 16, 2022), this project primarily exists as a set code katas under the /test/java/com/michaelmarcal directory.  
To run all tests, automatically, via maven, use the following command:
```aidl
mvn test
```

Supporting code and example solutions will be housed in /src/main/java/com/michaelmarcal/ directory.
## SDK
This project uses OpenJDK 17.0.2.

## IDE
This project was developed in IntelliJ Community version.  SDK can be set in Module settings in IntelliJ to run using
in addition to the maven goals identified above.