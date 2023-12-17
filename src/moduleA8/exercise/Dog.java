package moduleA8.exercise;

// Dog class, extending the Mammalian class
public class Dog extends Mammalian {

    // Overriding the makeSounds method from the Mammalian class
    @Override
    public void makeSounds() {
        // Printing a message indicating that the dog barks,
        // using the name property from the Mammalian class
        System.out.println(name + " bark");
    }
}

