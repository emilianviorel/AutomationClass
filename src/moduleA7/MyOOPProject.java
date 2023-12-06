/*
package moduleA7.OOP;

public class MyOOPProject {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.writer = "Mihai Eminescu";
        book1.title = "Poezii";
        book1.price = 35.00;

        Book book2 = new Book();
        book2.writer = "Ion Creanga";
        book2.title = "Amintiri din copilarie";

        System.out.println(book1.price);
        System.out.println(book2.price);

        System.out.println(book1.getPrice());
        System.out.println(book1.display());

        book1.title = "Basme";
        System.out.println(book1.display());

        Car car1 = new Car();
        System.out.println(car1.make);

        Car car2 = new Car();
        car2.make = "Dacia";
        System.out.println(car2.make);

        Car car3 = new Car();
        car3.yearMake = 2010;

        System.out.println(car3.getYearMake());

        Car car4 = new Car();
        car4.yearMake = 2020;

        System.out.println(car4.getYearMake());

        Person person1 = new Person();
        System.out.println(person1.lastName);
        System.out.println(person1.firstName);

        Person person2 = new Person("Ion", "Popescu");
        System.out.println(person2.age);
        System.out.println(person2.sex);

        Person person3 = new Person(35, "M", "Ion");
        System.out.println(person3.age);
    }
}
*/
// Main class containing the entry point of the program
package moduleA7;

public class MyOOPProject {
    public static void main(String[] args) {

        // Creating instances of the Book class
        Book book1 = new Book();
        book1.writer = "Mihai Eminescu";
        book1.title = "Poezii";
        book1.price = 35.00;

        Book book2 = new Book();
        book2.writer = "Ion Creanga";
        book2.title = "Amintiri din copilarie";

        // Printing prices of books
        System.out.println(book1.price);
        System.out.println(book2.price);

        // Using methods from the Book class
        System.out.println(book1.getPrice());
        System.out.println(book1.display());

        // Modifying the title of book1 and displaying the result
        book1.title = "Basme";
        System.out.println(book1.display());

        // Creating instances of the Car class
        Car car1 = new Car();
        System.out.println(car1.make);

        Car car2 = new Car();
        car2.make = "Dacia";
        System.out.println(car2.make);

        // Setting and getting the year make of cars
        Car car3 = new Car();
        car3.yearMake = 2010;
        System.out.println(car3.getYearMake());

        Car car4 = new Car();
        car4.yearMake = 2020;
        System.out.println(car4.getYearMake());

        // Creating instances of the Person class
        Person person1 = new Person();
        System.out.println(person1.lastName);
        System.out.println(person1.firstName);

        // Creating a person with specified values
        Person person2 = new Person("Ion", "Popescu");
        System.out.println(person2.age);
        System.out.println(person2.sex);

        // Creating a person with specified values
        Person person3 = new Person(35, "M", "Ion");
        System.out.println(person3.age);
    }
}





