package nordstrom.project.Lesson_02_Classes;

public class Person {
    // Classes are the blueprints for objects. They can contain methods and variables.
    // The class is the blueprint that describes the state and behavior that the objects of the class all share.
    // A class can be used to create many objects. Objects created at runtime from a class are called instances of that particular class.
    // This class will be used as a blueprint for a Person Object.

    // Properties/Fields/Attributes
    // Fields are like variables, but they belong to the class in which they are defined, and they can be accessed from any method in that class.
    // Fields that are declared public can be accessed from anywhere.
    // Private fields are accessible only within the class in which they are declared.
    // Alternatively you can not specifiy private/public and the field will default to private.
    // Fields should always be declared at the top of a Class, before methods.

    public String name; // public field
    private int age; // private field
    String email; // private field
    protected String address; // protected fields can be accessed by subclasses. They are private by default.

    // Methods are functions that belong to a class.
    // Methods can be public, private or static (or protected if the class is a subclass).
    // Public methods can be accessed from anywhere.
    // Private methods can only be accessed from within the class.
    // Static methods can be accessed without creating an instance of the class.
    // Methods should always be declared after fields.

    // It is common practice to use getters and setters to access and update the values of private fields.
    // In Intelij you can quickly generate getters and setters by right clicking in the class and selecting generate.
    // Getters and Setters are methods that are used to access and update the values of private fields.
    // Getters are used to access the value of a private field.
    // Setters are used to update the value of a private field.
    // Why bother using them? Why not just make the fields public?
    // Because getters and setters allow you to control how the fields are accessed and updated.
    // While we won't cover that in this lesson, it is talked about in more detail in Lesson_06_Exceptions.

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Constructors are special methods that are used to create instances of a class.
    // Constructors are used to initialize the fields of an object.
    // Constructors are called when an object is created using the new keyword.
    // A constructor should have the same name as the class and no return type.

    // Constructor
    public Person(String name, int age, String email, String address) {
        // By default you can just set the fields directly
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;

        // Alternatively we can use the setters we just created before
        // By using the setters we can control how the fields are updated and throw exceptions if the values are invalid
        // Inside the setters we can also add additional logic to update other fields or perform other actions
        setName(name);
        setAge(age);
        setEmail(email);
        setAddress(address);
    }

    // You can have multiple constructors in a class.
    // This is called constructor overloading.
    // Constructor overloading allows you to create objects in different ways.
    // For example, you can create an object with just a name, or with a name and age, or with a name, age and email.

    // Overloaded Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.email = "no email";
        this.address = "no address";

        // In this case the user did not specify an email, so we set it to "no email" by default.
    }

    // Method overriding allows you to change the behavior of a method in a subclass.
    // Becasue this class is a subclass of the Object class, we can override Object's toString() method
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Email: " + email;
    }
}
