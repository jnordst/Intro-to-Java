package nordstrom.project.Lesson_05_Loops;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class For {
    // The for loop is the most commonly used loop in Java.
    // The for loop is used when you know how many times you want to loop through a block of code.
    // The for loop has the following syntax:

    ArrayList<String> weekdays = new ArrayList<String>(){
        {
            add("Monday");
            add("Tuesday");
            add("Wednesday");
            add("Thursday");
            add("Friday");
            add("Saturday");
            add("Sunday");
        }
    };

    public void myFunction() {
        // for i loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i); // -> 0, 1, 2, 3, 4

            // This code will be executed 5 times
            // The variable i will be incremented by 1 each time the code is executed
            // The loop will stop when i is no longer less than 5
            // The variable i is only accessible from within the loop
            // The variable i is called the loop counter

            // Lets break down exactly what is happening here...
            // Iteration 1: i = 0. 0 < 5 is true. Execute the code. Increment i by 1.
            // Iteration 2: i = 1. 1 < 5 is true. Execute the code. Increment i by 1.
            // Iteration 3: i = 2. 2 < 5 is true. Execute the code. Increment i by 1.
            // Iteration 4: i = 3. 3 < 5 is true. Execute the code. Increment i by 1.
            // Iteration 5: i = 4. 4 < 5 is true. Execute the code. Increment i by 1.
        }

        // The for loop can also be used to iterate over an array or ArrayList.
        for (int j = 0; j < weekdays.size(); j++) {
            System.out.println(weekdays.get(j)); // -> Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
        }

        // for each loop
        for (String weekday : weekdays) {
            System.out.println(weekday); // -> Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday

            // This code will be executed 7 times
            // The variable weekday will be assigned the value of each element in the ArrayList
            // The loop will stop when there are no more elements in the ArrayList
        }
    }
}
