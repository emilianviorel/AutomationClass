// Abstract class representing an Athlete
package moduleA8;

abstract class Athlete {

    // Abstract method representing athlete training
    abstract void isTraining();

    // Concrete method representing athlete resting
    public void isResting() {
        System.out.println("Athlete resting");
    }
}
