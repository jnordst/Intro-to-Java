package nordstrom.project.Lesson_04_Functions;

public class Scope {
    // There are two types of scope: local scope and global scope.
    // Local scope refers to variables that are declared inside a function.
    // Local variables can only be accessed from within the function in which they are declared.
    // Global scope refers to variables that are declared outside of any function.
    // Global variables can be accessed from anywhere in the program.

    // This is a global variable.
    // It can be accessed from anywhere in the program.
    int myInt = 5;

    // This is a local variable.
    // It can only be accessed from within the myFunction() function.
    public void myFunction() {
        int myInt2 = 10;

        // We can still access the global variable from within this function
        int myInt3 = myInt;

        // You can also access the global variable using the this keyword
        int myInt4 = this.myInt;
    }

    // We cannot access the local variable from outside the function
    public void myFunction2() {
        // This will cause an error
        // int myInt4 = myInt2;
    }
}
