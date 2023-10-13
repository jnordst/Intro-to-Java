package nordstrom.project.Lesson_00_Getting_Started;

import java.util.Scanner;

public class Introduction {
    // Welcome to programming with Java!
    // Allow me to introduce you to the basics of Java programming.

    // Comments
    // This is a comment. Comments are used to explain what code does.
    // A comment is ignored by the compiler and is not executed.
    // Comments are very useful for explaining what code does.
    // Comments can also be used to disable code.
    // WorldDomination.Excute(); // This line of code is disabled because it is commented out.
    // A comment can be created by typing two forward slashes (//) followed by the comment.
    // Additioanlly a comment can be created by typing...
    /* followed by the comment and then */
    /*
     These kinds of comments
     can span multiple lines
     !!!
    */

    // Main
    // Every Java program must have a main method similarly to C# which uses the Program.cs file.
    // The main method is the entry point of a Java program.
    // In Javafx applications the Main method usually just launches the application and most of our code is written in the controller files
    // Our main method is located in the Main.java file.

    public Introduction()
    {
        // Objects and Variables
        // (Almost) everything in Java is an object!
        // An object is something that has properties and methods.
        // A variable is a container for storing data.

        // Variables are declared using the following syntax:
        Object myObject = new Object(); // ClassName variableName = value semicolon
        String myString = "Hello World!"; // ClassName variableName = value semicolon

        // Learn more about Variables in Lesson_01_DataTypes

        // Console
        // The console is a window that displays text output from a program.
        // The console is used to display information to the user and to debug programs.

        // The System.out.println method prints text to the console and creates a new line.
        System.out.println("Hello World!"); // -> Hello World!

        // The print method prints text to the console without creating a new line.
        System.out.print("Hello"); // -> Hello
        System.out.print(" World!"); // -> Hello World!

        // Reading input from the console
        // The Scanner class is used to read input from the console.

        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their name
        System.out.println("Enter your name: "); // -> Enter your name:

        // Read the next line of text from the console and assign it to the variable name
        String name = scanner.nextLine();

        // Print the value of the variable name to the console
        System.out.println("Hello " + name + "!"); // -> Hello <name>!
    }
}
