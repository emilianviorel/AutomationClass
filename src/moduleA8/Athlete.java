// Abstract class representing an Athlete
package moduleA8;

// Abstract class Athlete
abstract class Athlete {

    // Attributes for Athlete
    String country;
    String sport;

    // Composition: Athlete has an Ability
    Ability ability;

    public Athlete() {
    }

    // Constructor for Athlete class
    public Athlete(String country, String sport) {
        this.country = country;
        this.sport = sport;
    }

    // Abstract method representing athlete training
    abstract void isTraining();

    // Concrete method representing athlete resting
    public void isResting() {
        // Print a message indicating that the Athlete is resting
        System.out.println("Athlete resting");
    }
}
