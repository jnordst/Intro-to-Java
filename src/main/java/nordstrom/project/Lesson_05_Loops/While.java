package nordstrom.project.Lesson_05_Loops;

import java.util.ArrayList;

public class While {
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

    // The While loop is used to execute a block of code repeatedly until a condition is met.
    // The while loop has the following syntax:
    public void myFunction() {
        // while loop
        int i = 0;
        while (i < 5) {
            System.out.println(i); // -> 0, 1, 2, 3, 4
            i++; // Increment i by 1

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

        // The while loop can also be used to iterate over an array or ArrayList.
        int j = 0;
        while (j < weekdays.size()) {
            System.out.println(weekdays.get(j)); // -> Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
            j++; // Increment j by 1
        }

        // Loop while a condition is true
        boolean myBool = true;
        while (myBool) { // Same as saying while(myBool == true)
            // This code will be executed until myBool is set to false
            myBool = false;
        }

        // do while loop
        int k = 5;
        do {
            System.out.println(k); // -> 5
            k++;
        } while (k < 5);

        // do while loop is executed AT LEAST once before the condition is checked
        // This code will be executed once even though the variable is NOT less than 5
        // After the code is run the condition is checked and the loop is exited

    }
}
