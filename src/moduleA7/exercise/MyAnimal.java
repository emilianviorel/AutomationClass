package moduleA7.exercise;

/*
1. Create a new class called Animal with the attributes: name (String), color (String), vegetarian (boolean);
2. Add a constructor with 0 parameters with default values (name "unknown", color "unknown", vegetarian "false");
3. Add 3 constructors with 1, 2, 3 parameters (using this); Hint: Code > Generate > Builder
4. Add two (non-static) void methods for the Animal class: eat() and sleep() to display "animalName eats", respectively "animalName sleeps" (where Animal name = the animal's name)
5. Add a (non-static) display() method that will return (with return of String type) "nameAnimal has the color color".
6. In the Main Class, create two Animal type objects using constructors and values of your choice7. Also in Main, call the 3 methods (eat, sleep, display) with each of the two objects*/
// Class to test the Animal class
public class MyAnimal {
    public static void main(String[] args) {

        // Creating instances of the Animal class
        Animal britishCat = new Animal("Sofia", "grey");
        Animal persianCat = new Animal("Garfield", "orange", true);

        // Displaying information about the britishCat
        System.out.println("\n---britishCat---\n");
        britishCat.eat();
        britishCat.sleep();
        System.out.println(britishCat.display());

        // Displaying information about the persianCat
        System.out.println("\n---persianCat---\n");
        persianCat.eat();
        persianCat.sleep();
        System.out.println(persianCat.display());
        System.out.printf("Is %s vegetarian ? %s%n",
                persianCat.name, persianCat.vegetarian);
    }
}
