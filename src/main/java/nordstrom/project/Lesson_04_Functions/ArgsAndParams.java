package nordstrom.project.Lesson_04_Functions;

public class ArgsAndParams {
    // Functions can accept parameters, which are values that are passed into the function as arguments.
    // Parameters are specified inside the parentheses after the name of the function.
    // Parameters are separated by commas.
    // Parameters can be any data type, including custom classes, depending on the function's requirements.
    // Arguments are the actual values that are passed into the function. They are specified when the function is called.

    public void myFunction4(int myInt, String myString) { // Note the parameters are specified here
        // Code to be executed
        // This function accepts two parameters, an int and a String

        // We can access the values of the parameters inside the function body by using the name of the parameter
        int myInt2 = myInt;
        String myString2 = myString;

        // We can also pass ARGUMENTS into the function when we call it
        print("Hello, World!"); // These are called arguments when they are passed into the function
    }

    void print(String output) {
        System.out.println(output);
    }
}
