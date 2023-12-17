package moduleA9;

import java.util.ArrayList;

// Class representing a simple example of using ArrayList in Java
public class MyArrayList {

    // The main method serves as the entry point for the program
    public static void main(String[] args) {

        // Creating an ArrayList of Strings
        ArrayList<String> myList = new ArrayList<>();

        // Adding elements to the ArrayList
        myList.add("First");
        myList.add("Second");
        myList.add("Third");

        // Modifying elements in the ArrayList
        myList.set(0, "First replaced"); // Replacing the element at index 0
        myList.remove(2); // Removing the element at index 2

        // Iterating through the ArrayList and printing each element
        for (String element : myList) {
            System.out.println(element);
        }

        // Displaying the size of the ArrayList
        System.out.println(myList.size());

        // Checking if the ArrayList contains a specific element
        System.out.println(myList.contains("Second"));

        // Finding the index of a specific element in the ArrayList
        System.out.println(myList.indexOf("Second"));
    }
}
