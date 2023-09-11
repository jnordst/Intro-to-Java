package nordstrom.project.Lesson_03_Subclasses;

import nordstrom.project.Lesson_02_Classes.Person;

public class Teacher extends Person { // The extends keyword is used to create a subclass.
    // A subclass is a class that inherits from another class.
    // A subclass is also called a child class.
    // A subclass inherits all the fields and methods of its parent class.
    // A subclass can also have its own fields and methods.
    // A subclass can override the methods of its parent class.
    // In this case Teacher is a subclass of Person and inherits all of its fields and methods.

    // Create new fields for the Teacher class
    // These fields are specific to the Teacher class and are not shared with the Person class since a Person does not have an employeeId or department.
    private String employeeId;
    private String department;
    private Double salary;

    public Teacher(String name, int age, String email, String address, String employeeId, String department, Double salary) {
        // The super keyword is used to call the constructor of the parent class.
        // In this case we are calling the constructor of the Person class.
        super(name, age, email);

        // Accessing fields from the parent class
        this.name = name; // We can access the name field because it is public.
        // this.age = 20; // We cannot access the age field because it is private.
        this.address = address; // We can access the address field because it is protected.

        // Accessing fields from the current class
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }
}
