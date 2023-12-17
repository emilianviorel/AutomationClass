// Class representing a Swimmer, extending Athlete
package moduleA8;

// Swimmer class extends the Athlete class
public class Swimmer extends Athlete {

    // Default constructor for Swimmer
    public Swimmer() {
    }

    // Constructor for Swimmer class
    public Swimmer(String country, String sport) {
        // Call the constructor of the base class (Athlete) with the provided country and sport
        super(country, sport);
    }

    // Implementation of the abstract method for Swimmer
    @Override
    public void isTraining() {
        // Print a message indicating that the Swimmer is training
        System.out.println("Swimmer is training");
    }

    // Overridden method for Swimmer resting
    public void isResting() {
        // Print a message indicating that the Swimmer is resting
        System.out.println("Swimmer is resting");
    }
}
