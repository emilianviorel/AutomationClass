package moduleA8.exercise;

// Cat class, extending the Mammalian class
public class Cat extends Mammalian {

    // Overriding the makeSounds method from the Mammalian class
    @Override
    public void makeSounds() {
        // Printing a message indicating that the cat meows,
        // using the name property from the Mammalian class
        System.out.println(name + " meows");
    }
}

