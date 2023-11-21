package nordstrom.project.Lesson_04_Functions;

public class Returns {
    // Functions can return a value by specifying a return type.
    // The return type is specified before the name of the function.
    // The return type can be any data type, including custom classes.
    // If the function does not return a value, the return type is void.

    private String name = "Jacob";

    public String getName() {
        // This return type of this function is String
        // This means that it must return a String value

        // Return the name which is a String
        return name;
    }

    public int add(int num1, int num2) {
        // The return type of this function is int
        // This means that it must return an int value
        // This function accepts two parameters, both ints

        // Add the two numbers together
        int sum = num1 + num2;

        // Return the result
        return sum;
    }

    public void Main()
    {
        // The return type of this function is void
        // This means that it does not return a value

        // Calling the add() Function
        int result = add(5, 10); // The return value of the function is stored in the result variable
        System.out.println(result); // -> 15

        // Calling the getName() Function
        String name = getName(); // The return value of the function is stored in the name variable
        System.out.println(name); // -> Jacob
    }
}
