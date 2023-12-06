/*
package moduleA7.OOP;

public class Person {

    int age;
    String sex;
    String lastName;
    String firstName;

    Person() {
        age = 20;
        sex = "M";
        lastName = "Unknown";
        firstName = "Unknown";
    }

    public Person(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Person(int age, String sex, String lastName) {
        this.age = age;
        this.sex = sex;
        this.lastName = lastName;
    }
}
*/
// Class representing a Person
package moduleA7;

public class Person {

    // Instance variables with default values
    int age;
    String sex;
    String lastName;
    String firstName;

    // Default constructor
    Person() {
        age = 20;
        sex = "M";
        lastName = "Unknown";
        firstName = "Unknown";
    }

    // Constructor with specified last and first names
    public Person(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    // Constructor with specified age, sex, and last name
    public Person(int age, String sex, String lastName) {
        this.age = age;
        this.sex = sex;
        this.lastName = lastName;
    }
}