package nordstrom.project.Lesson_04_Functions;

public class ArgsAndParams {
    // Functions can accept parameters, which are values that are passed into the function as arguments.
    // Parameters are specified inside the parentheses after the name of the function.
    // Parameters are separated by commas.
    // Parameters can be any data type, including custom classes, depending on the function's requirements.
    // Arguments are the actual values that are passed into the function. They are specified when the function is called.

    public void add(int num1, int num2) { // Note the parameters are specified here
        // This function accepts two parameters, both ints
        // This function adds together the sum of the parameters and prints the result
        // You can access the parameters like any other variable to perform operations on them
        // You can even change the value of the parameters if you want

        // Add the two numbers together
        int sum = num1 + num2;

        // Print the result
        System.out.println(sum);
    }

    public void Main() {
        // Calling the add() Function
        add(5, 10); // These are called arguments when they are passed into the function
        // -> 15
    }
}
