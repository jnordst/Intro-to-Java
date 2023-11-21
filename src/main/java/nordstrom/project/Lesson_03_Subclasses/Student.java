package nordstrom.project.Lesson_03_Subclasses;

import nordstrom.project.Lesson_02_Classes.Person;

public class Student extends Person { // The extends keyword is used to create a subclass.
    // A subclass is a class that inherits from another class.
    // A subclass is also called a child class.
    // A subclass inherits all the fields and methods of its parent class.
    // A subclass can also have its own fields and methods.
    // A subclass can override the methods of its parent class.
    // In this case Student is a subclass of Person and inherits all of its fields and methods.

    // Create new fields for the Student class
    // These fields are specific to the Student class and are not shared with the Person class since a Person does not have a program or student number.
    private String program;
    private String studentNumber;
    private int grade;

    // We do not need to respecify the Getters and Setters from the Person class because they are inherited by the Student class.

    // Getters and Setters
    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // Constructor
    public Student(String name, int age, String email, String address, String program, String studentNumber, int grade) {
        // The super keyword is used to call the constructor of the parent class.
        // In this case we are calling the constructor of the Person class.
        super(name, age, email, address);

        // Accessing fields from the parent class
        this.name = name; // We can access the name field because it is public.
        // this.age = 20; // We cannot access the age field because it is private.
        this.address = address; // We can access the address field because it is protected.

        // Accessing fields from the current class
        this.program = program;
        this.studentNumber = studentNumber;
        this.grade = grade;
    }

    // Overriding a method from the parent class
    // The toString() method is a method that is inherited from the Object class.
    @Override
    public String toString() {
        return "My name is " + name + ", and I am a student in the " + program + " program.";
    }
}
