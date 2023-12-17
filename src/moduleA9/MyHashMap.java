package moduleA9;

import java.util.HashMap;

// Class representing a simple example of using HashMap in Java
public class MyHashMap {

    // The main method serves as the entry point for the program
    public static void main(String[] args) {

        // Creating a HashMap with Integer keys and String values
        HashMap<Integer, String> myMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        myMap.put(1, "First");
        myMap.put(2, "Second");
        myMap.put(3, "Third");
        myMap.put(4, "Four");

        // Replacing the value associated with key 3
        myMap.replace(3, "Third replace");

        // Printing the values associated with specific keys
        System.out.println(myMap.get(3));
        System.out.println(myMap.get(4));

        // Printing the set of keys and values in the HashMap
        System.out.println(myMap.keySet());
        System.out.println(myMap.values());

        // Replacing the value associated with key 3 only if it is currently "Third"
        System.out.println(myMap.replace(3, "Third", "Third replace"));

        // Printing the size of the HashMap
        System.out.println(myMap.size());

        // Removing an entry from the HashMap
        myMap.remove(3);

        // Printing the updated size of the HashMap
        System.out.println(myMap.size());

        // Printing the set of key-value pairs in the HashMap
        System.out.println(myMap.entrySet());

        // Checking if a specific value is present in the HashMap
        System.out.println(myMap.containsValue("First"));

        // Checking if a specific key is present in the HashMap
        System.out.println(myMap.containsKey(1));

        // Iterating through the keys and printing each key
        for (int key : myMap.keySet()) {
            System.out.println(key);
        }

        // Iterating through the values and printing each value
        for (String value : myMap.values()) {
            System.out.println(value);
        }

        // Printing the set of key-value pairs in the HashMap
        System.out.println(myMap.entrySet());
    }
}


