package nordstrom.project.Lesson_06_Exceptions;

import nordstrom.project.Lesson_03_Subclasses.Student;
import nordstrom.project.Lesson_03_Subclasses.Teacher;

public class Main {
    public static void main(String[] args) {
        // When you are running code that may throw an exception you need to use a try/catch block.
        // A try/catch block is used to handle exceptions.
        // If an exception is thrown in the try block the catch block will catch the exception and handle it.
        // If you do not use a try/catch block when an exception is thrown the program will crash.

        // Setting our role
        User.Role = "User";

        try {
            // Creating a Person Object
            Person person = new Person("John Smith", 20, "email@email.com");
            System.out.println(person.getName()); // -> getName() returns John Smith, then it is printed to the console
        } catch (Exception e) {
            // If an Exception is thrown in the try block, the catch block will catch it and handle it.
            // In this case we are printing the error message.
            System.out.println(e.getMessage());
        }

        // In the above example a SecurityException is thrown because the User role is not set to Admin.
        // Therefore we do not have permission to access the getName() method.

        // Setting our role
        User.Role = "Admin";

        try {
            // Creating a Person Object
            Person person = new Person("John Smith2", 220, "email");
            System.out.println(person.getName());
        } catch (Exception e) {
            // If an Exception is thrown in the try block, the catch block will catch it and handle it.
            // In this case we are printing the error message.
            System.out.println(e.getMessage());
        }

        // This time we have permission to access the getName() method because the User role is set to Admin however...
        // In the above example an IllegalArgumentException is thrown because:
            // 1. The name contains a number
            // 2. The age is greater than 220
            // 3. The email does not contain an @ symbol

        // Inside the catch block you could update a warning label with the error message
        // This way the user knows what they did wrong and can fix it.


        // Recap:
        // Exceptions are used to handle errors. They are used to indicate that something has gone wrong.
        // If your code expects an exception to be thrown, you must put it inside a try block
        // If an exception is thrown in the try block, the catch block will catch it and handle it.
    }
}
