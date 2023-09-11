package nordstrom.project.Lesson_03_Subclasses;

import nordstrom.project.Lesson_02_Classes.Person;

public class Main {
    public static void main(String[] args) {
        // Objects are instances of classes
        // Objects are created using the new keyword followed by the name of the class and the arguments for the constructor.

        // Creating a Person Object
        Person person = new Person("John Smith", 20, "JohnSmith@email.com", "123 Georgian Lane");

        // Creating a Student Object
        Student student = new Student("Jane Doe", 20, "Jane.Doe@MyGeorgian.ca",
                "123 Georgian Crescent", "Computer Programming", "123456789", 90);

        // Creating a Teacher Object
        Teacher teacher = new Teacher("Bob Door", 40, "Bob.Door@GeorgianCollege.ca",
                "123 Georgian Drive", "123456789", "Computer Programming", 69000.00);

        // Accessing fields and methods from classes
        System.out.println("Person Name: " + person.getName()); // Person Name: John Smith
        System.out.println("Student Name: " + student.getName()); // Student Name: Jane Doe
        System.out.println("Teacher Name: " + teacher.getName()); // Teacher Name: Bob Door
        System.out.println(student.toString()); // My name is Jane Doe, and I am a student in the Computer Programming program.
    }
}
