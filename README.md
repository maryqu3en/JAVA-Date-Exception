# Date Validation Project

This project contains a simple Java program that validates a date based on day and month values.

## Classes

There are three classes in this project:

1. `DException`: This is an exception class that extends the `Exception` class. It is used to throw an exception when an invalid date is created.

2. `Date`: This class represents a date with day and month values. It includes a constructor that validates the day and month values. If the values are not valid (day is not between 1 and 30, or month is not between 1 and 12), it throws a `DException`.

3. `Test`: This class contains the `main` method that tests the `Date` class. It tries to create a valid date and an invalid date, and catches any `DException` that is thrown.

## How to Run

To run the program, you need to compile the `Test` class and then run it. Use the following commands in your terminal:

```bash
javac Test.java
java Test
```
The program will print the valid date and any exception message for an invalid date.