// Class representing a Marathoner, extending Athlete
package moduleA8;

// Marathoner class extends the Athlete class
public class Marathoner extends Athlete {

    // Default constructor for Marathoner
    public Marathoner() {
    }

    // Constructor for Marathoner class
    public Marathoner(String country, String sport) {
        // Call the constructor of the base class (Athlete) with the provided country and sport
        super(country, sport);
    }

    // Implementation of the abstract method for Marathoner
    @Override
    public void isTraining() {
        // Print a message indicating that the Marathoner is training
        System.out.println("Marathoner is training");
    }

    // Overridden method for Marathoner resting
    public void isResting() {
        // Print a message indicating that the Marathoner is resting
        System.out.println("Marathoner is resting");
    }
}
