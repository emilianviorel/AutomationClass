// Class representing a Marathoner, extending Athlete
package moduleA8;

public class Marathoner extends Athlete {

    // Implementation of the abstract method for Marathoner
    @Override
    public void isTraining() {
        System.out.println("Marathoner is training");
    }

    // Overridden method for Marathoner resting
    public void isResting() {
        System.out.println("Marathoner is resting");
    }
}
