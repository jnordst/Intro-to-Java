package nordstrom.project.Lesson_06_Exceptions;

public class Person {
    // Properties
    private String name;
    private int age;
    private String email;

    // Getters and Setters
    // In Lesson 2 Classes we talked about Getters and Setters for classes, and why they're important.
    // In this lesson I will show why we use Getters and Setters and how you can use Exceptions to make them more powerful.

    public String getName() {
        // This is a getter for the name field.
        // The getter is PUBLIC meaning any class can access it as long as they have an instance of the Person class.
        // But if any class has access to this method, what's the point of making the name field private in the first place?
        // The reason we make the name field private is so that we can control how it is accessed and updated using the getter and setter.

        // For example we can add a check to make sure the User has permission to access the name field.
        if (User.Role != "Admin") {
            // If the User is not an Admin, throw an exception.
            // Exceptions are used to handle errors. They are used to indicate that something has gone wrong.
            // Anytime you throw an exception, you must also catch it.
            // SecurityException is used to indicate a security violation.
            throw new SecurityException("You do not have permission to access this field.");
        }

        // If the User.Role IS Admin they will not throw an Exception and we return the name
        // We do not need an else statement because if an exception is thrown the function will stop running and the return statement will not be reached.
        // Feel free to add an else statement if it makes it easier for you to understand.
        return name;
    }

    public void setName(String name) {
        // Inside the Setter we can create validation to make sure the name the user submitted is valid.

        // Check if the name contains a number
        if (name.matches(".*\\d.*")) {
            // If the name contains a number, throw an exception.
            // IllegalArgumentException is used to indicate that a method has been passed an illegal or inappropriate argument.
            throw new IllegalArgumentException("The name cannot contain a number.");
        }

        // If the name does not contain a number, set the name of the Person to the name that was passed into the function
        // A reminder: this.name refers to the name field of the Person class while name refers to the parameter name that was passed into the function.
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // Check if the age is less than 0
        if (age < 0) {
            // If the age is less than 0, throw an exception.
            throw new IllegalArgumentException("The age cannot be less than 0.");
        }

        // Check if the age is greater than 120
        if (age > 120) {
            // If the age is greater than 120, throw an exception.
            throw new IllegalArgumentException("The age cannot be greater than 120.");
        }

        // If the age is between 0 and 120, set the age
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        // Check if the email contains an @ symbol
        if (email.contains("@")) {
            // If the email does contain an @ symbol, throw an exception.
            throw new IllegalArgumentException("Please provide a valid email address.");
        }

        // If the email contains an @ symbol, set the email
        this.email = email;
    }

    public Person(String name, int age, String email) {
        // When creating a new Person object we can use the setter to set the values of the fields.
        // This way we can the validation provided by the setters to make sure the values are valid.
        setName(name);
        setAge(age);
        setEmail(email);
    }
}
