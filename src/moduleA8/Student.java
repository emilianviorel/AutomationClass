// Class representing a Student
package moduleA8;

public class Student {

    // Properties of the Student
    String name;
    public static String teacher = "Isosceles";

    // Constructor with a specified name
    public Student(String name) {
        this.name = name;
    }

    // Non-static method specific to Student
    public void nonStaticMethod() {
        System.out.println("Non-static method");
    }

    // Static method specific to Student class
    public static void staticMethod() {
        System.out.println("Static method");
    }
}

