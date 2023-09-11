package nordstrom.project.Lesson_01_DataTypes;

public class Booleans {
    // In Java, Booleans are a data type that can be used to represent the truth values true and false.
    // They are often used in conditional statements, such as if statements, to determine which branch of code to execute.
    // Booleans in Java are of the boolean type and can only have two possible values: true or false.
    // Boolean variables can be declared using the boolean keyword and assigned values using the literals true and false.
    // Java provides a wide range of logical operators and methods for manipulating boolean values, such as AND, OR, and NOT.

    boolean myBoolean;

    public void Booleans()
    {
        // Declare a variable of type boolean named myBoolean
        myBoolean = true;

        // Declare and initialize a boolean variable named myBoolean2
        boolean myBoolean2 = false;

        // Perform logical operations on boolean variables
        boolean and = myBoolean && myBoolean2; // false
        boolean or = myBoolean || myBoolean2; // true
        boolean not = !myBoolean; // false

        // Boolean variables can be used in conditional statements
        if (myBoolean) {
            // Do something
        }

        // Boolean variables can be used in loops
        while (myBoolean) {
            // Do something
        }
    }
}
