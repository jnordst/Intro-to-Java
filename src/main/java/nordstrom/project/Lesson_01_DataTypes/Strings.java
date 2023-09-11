package nordstrom.project.Lesson_01_DataTypes;

public class Strings {
    // In Java, strings are objects that represent sequences of characters.
    // They are used to store and manipulate textual data.
    // Strings in Java are immutable, meaning that once a string is created, its contents cannot be changed.
    // This immutability ensures that strings are thread-safe and can be safely shared among different parts of a program.
    // Java provides a rich set of methods and operators for working with strings, allowing operations such as concatenation, searching, replacing, and extracting substrings.
    // Strings in Java are widely used in various applications, from simple text processing to complex data manipulation and manipulation.

    // Declare a string variable named myString
    String myString;

    public void Strings()
    {
        // Assign a value to myString
        myString = "Hello, World!";

        // String Concatenation
        String concatenated = "Hello" + "World!"; // concatenated = "HelloWorld!"

        // String Comparison
        // The == operator can be used to compare strings, but it only compares the references, not the actual contents of the strings
        // It is recommended to use the equals() method instead of the == operator when comparing strings
        boolean equal = "Hello, World!" == myString; // equal = true
        String otherString = "Hello, World!";
        boolean equal2 = myString == otherString; // equal2 = false
        // The equals() method compares the contents of the strings
        boolean equal3 = myString.equals(otherString); // equal3 = true

        // String Functions

        // length() returns the length of the string
        int length = myString.length(); // length = 13

        // charAt() returns the character at the specified index
        char firstChar = myString.charAt(0); // firstChar = 'H'

        // substring() returns a substring of the string
        String substring = myString.substring(0, 5); // substring = "Hello"

        // indexOf() returns the index of the first occurrence of the specified character
        int index = myString.indexOf('o'); // index = 4

        // replace() returns a new string with all occurrences of the specified character replaced by another character
        String replaced = myString.replace('o', 'a'); // replaced = "Hella, Warld!"

        // toLowerCase() returns a new string with all characters converted to lowercase
        String lowerCase = myString.toLowerCase(); // lowerCase = "hello, world!"

        // toUpperCase() returns a new string with all characters converted to uppercase
        String upperCase = myString.toUpperCase(); // upperCase = "HELLO, WORLD!"

        // trim() returns a new string with all leading and trailing whitespace removed
        String trimmed = myString.trim(); // trimmed = "Hello, World!"

        // split() returns an array of strings split by the specified character
        String[] split = myString.split(","); // split = ["Hello", " World!"]

        // equals() returns true if the string is equal to another string
        // It is recommended to use the equals() method instead of the == operator when comparing strings
        boolean equals = myString.equals("Hello, World!"); // equals = true

        // equalsIgnoreCase() returns true if the string is equal to another string, ignoring case
        boolean equalsIgnoreCase = myString.equalsIgnoreCase("hello, world!"); // equalsIgnoreCase = true

        // startsWith() returns true if the string starts with the specified prefix
        boolean startsWith = myString.startsWith("Hello"); // startsWith = true

        // endsWith() returns true if the string ends with the specified suffix
        boolean endsWith = myString.endsWith("World!"); // endsWith = true

        // contains() returns true if the string contains the specified substring
        boolean contains = myString.contains("Hello"); // contains = true

        // isEmpty() returns true if the string is empty
        boolean isEmpty = myString.isEmpty(); // isEmpty = false

        // concat() returns a new string with the specified string appended to the end
        String concat = myString.concat(" Goodbye!"); // concat = "Hello, World! Goodbye!"

        // join() returns a new string with the specified strings joined by the specified delimiter
        String joined = String.join(" ", "Hello", "World!"); // joined = "Hello World!"

        // valueOf() returns a string representation of the specified value
        String valueOf = String.valueOf(5); // valueOf = "5"

        // format() returns a formatted string using the specified format string and arguments
        String format = String.format("Hello, %s!", "World"); // format = "Hello, World!"
    }
}
