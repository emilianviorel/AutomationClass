// Class representing a Swimmer, extending Athlete
package moduleA8;

public class Swimmer extends Athlete {

    // Implementation of the abstract method for Swimmer
    @Override
    public void isTraining() {
        System.out.println("Swimmer is training");
    }

    // Overridden method for Swimmer resting
    public void isResting() {
        System.out.println("Swimmer is resting");
    }
}
