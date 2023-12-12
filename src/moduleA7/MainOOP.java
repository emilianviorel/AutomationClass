// Main class containing the entry point of the program
package moduleA7;

import moduleA8.Marathoner;
import moduleA8.Movie;
import moduleA8.Student;
import moduleA8.Swimmer;
import moduleA8.exercise.Cat;
import moduleA8.exercise.Dog;


public class MainOOP {
    public static void main(String[] args) {

        // Creating instances of the Book class
        Book book1 = new Book();
        book1.writer = "Mihai Eminescu";
        book1.title = "Poezii";
        book1.price = 35.00;

        Book book2 = new Book();
        book2.writer = "Ion Creanga";
        book2.title = "Amintiri din copilarie";

        // Displaying prices of books
        System.out.println("\n---Book Prices---\n");
        System.out.println(book1.price);
        System.out.println(book2.price);

        // Using methods from the Book class
        System.out.println("\n---Book Methods---\n");
        System.out.println(book1.getPrice());
        System.out.println(book1.display());

        // Modifying the title of book1 and displaying the result
        System.out.println("\n---Modified Book1---\n");
        book1.title = "Basme";
        System.out.println(book1.display());

        // Creating instances of the Car class
        System.out.println("\n---Car Instances---\n");
        Car car1 = new Car();
        System.out.println(car1.make);

        Car car2 = new Car();
        car2.make = "Dacia";
        System.out.println(car2.make);

        // Setting and getting the year make of cars
        System.out.println("\n---Car Year Make---\n");
        Car car3 = new Car();
        car3.yearMake = 2010;
        System.out.println(car3.getYearMake());

        Car car4 = new Car();
        car4.yearMake = 2020;
        System.out.println(car4.getYearMake());

        // Creating instances of the Person class
        System.out.println("\n---Person Instances---\n");
        Person person1 = new Person();
        System.out.println(person1.lastName);
        System.out.println(person1.firstName);

        // Creating a person with specified values
        System.out.println("\n---Person With Values---\n");
        Person person2 = new Person("Ion", "Popescu");
        System.out.println(person2.age);
        System.out.println(person2.sex);

        // Creating a person with specified values
        System.out.println("\n---Another Person---\n");
        Person person3 = new Person(35, "M", "Ion");
        System.out.println(person3.age);

        // Creating instances of the Car class
        System.out.println("\n---More Car Instances---\n");
        Car car5 = new Car();
        System.out.println(car5.make);

        Car car6 = new Car("Tesla", 2022);
        System.out.println(car6.make + " " + car6.getYearMake());

        // Creating instances of the Student class
        System.out.println("\n---Student Instances---\n");
        Student student1 = new Student("Popescu");
        Student student2 = new Student("Ionescu");

        // Displaying student information
        System.out.println(student1);
        System.out.println(student2);
        student1.teacher = "Isoscel2";
        System.out.println(student2.teacher);

        // Calling static and non-static methods of the Student class
        System.out.println("\n---Student Methods---\n");
        student1.nonStaticMethod();
        Student.staticMethod();

        // Creating an instance of the Movie class and displaying the title
        System.out.println("\n---Movie Instance---\n");
        Movie movie1 = new Movie();
        movie1.setTitle("Titanic");
        System.out.println(movie1.getTitle());

        // Creating instances of classes that implement the Swimmer and Marathoner interfaces
        System.out.println("\n---Athlete Instances---\n");
        Swimmer swimmer1 = new Swimmer();
        swimmer1.isTraining();
        swimmer1.isResting();

        Marathoner marathoner1 = new Marathoner();
        marathoner1.isTraining();
        marathoner1.isResting();

        // Creating instances of the exercise classes
        System.out.println("\n---Exercise ModuleA8---\n");

        Cat britishCat = new Cat();
        Dog bulldogDog = new Dog();

        britishCat.makeSounds();
        bulldogDog.makeSounds();
    }
}
