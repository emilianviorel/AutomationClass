/*
package moduleA7.OOP;

public class Car {
    String make = "BMW";
    int yearMake = 2000;

    public int getYearMake() {
        return yearMake;
    }

}
*/
// Class representing a Car
package moduleA7;

public class Car {
    // Instance variables with default values
    String make;
    int yearMake;

    public Car() {
        make = "BMW";
        yearMake = 2000;
    }

    public Car(String make, int yearMake) {
        this.make = make;
        this.yearMake = yearMake;
    }

    // Method to get the year make of the car
    public int getYearMake() {
        return yearMake;
    }
}