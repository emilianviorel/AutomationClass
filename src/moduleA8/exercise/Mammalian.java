package moduleA8.exercise;

// Importing the Animal class from the moduleA7.exercise package

import moduleA7.exercise.Animal;

// Mammalian class, extending the Animal class
public class Mammalian extends Animal {

    // Method to make sounds
    public void makeSounds() {
        // Printing a message indicating that the mammalian makes sounds,
        // using the name property from the Animal class
        System.out.println(this.name + " make sounds");
    }
}

