package nordstrom.project.Lesson_01_DataTypes;

import java.util.ArrayList;
import java.util.List;

public class Integers {
    // In Java, integers are a data type used to represent whole numbers without any decimal or fractional part.
    // They are commonly used for counting, indexing, and performing arithmetic operations.
    // Integers in Java are of the int type and have a fixed range of values.
    // The int type is a 32-bit signed two's complement integer, capable of storing values from -2,147,483,648 to 2,147,483,647.
    // Integer variables can be declared using the int keyword and assigned values using numerical literals or expressions.
    // Java provides a wide range of arithmetic operators and methods for manipulating integer values, such as addition, subtraction, multiplication, and division.
    // It's important to note that when performing division with integers, the result is truncated, meaning the decimal part is discarded.
    // Integers are fundamental data types in Java and play a crucial role in various programming tasks, from basic calculations to more complex algorithms.

    public void Integers()
    {
        // Declare an integer variable named myInt
        int myInt;

        // Assign a value to myInt
        myInt = 5;

        // Declare and initialize an integer variable named myInt2
        int myInt2 = 10;

        // Perform arithmetic operations on integer variables
        int sum = myInt + myInt2; // 15
        int difference = myInt - myInt2; // -5
        int product = myInt * myInt2; // 50
        int quotient = myInt / myInt2; // 0
        int remainder = myInt % myInt2; // 5

        // Increment and decrement integer variables
        myInt++; // 6
        myInt2--; // 9

        // Integer variables can be used in expressions
        int result = myInt + myInt2 * 2; // 24

        // Integer variables can be used in conditional statements
        if (myInt > myInt2) {
            // Do something
        }

        // Integer variables can be used in loops
        for (int i = 0; i < myInt; i++) {
            // Do something
        }

        // Integer variables can be used in methods
        int myInt3 = addNumbers(myInt, myInt2); // 15

        // Integer variables can be used in arrays
        int[] myInts = { myInt, myInt2, myInt3 };

        // Integer variables can be used in collections
        List<Integer> myIntList = new ArrayList<Integer>();
    }

    int addNumbers(int a, int b)
    {
        // Add two integers and return the result
        return a + b;
    }
}
