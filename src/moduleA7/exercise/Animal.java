package moduleA7.exercise;

// Class representing an Animal
public class Animal {

    // Instance variables to store information about the animal
    String name;
    String color;
    boolean vegetarian;

    // Default constructor initializing values to default values
    Animal() {
        name = "unknown";
        color = "unknown";
        vegetarian = false;
    }

    // Constructor with only name parameter
    public Animal(String name) {
        this.name = name;
    }

    // Constructor with name and color parameters
    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // Constructor with name, color, and vegetarian parameters
    public Animal(String name, String color, boolean vegetarian) {
        this.name = name;
        this.color = color;
        this.vegetarian = vegetarian;
    }

    // Method to simulate the animal eating
    public void eat() {
        System.out.printf("%s is eating.%n", name);
    }

    // Method to simulate the animal sleeping
    public void sleep() {
        System.out.printf("%s is sleeping.%n", name);
    }

    // Method to display information about the animal
    public String display() {
        return name + " have the color " + color;
    }
}
