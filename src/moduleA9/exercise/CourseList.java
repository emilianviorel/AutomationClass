package moduleA9.exercise;

import java.util.ArrayList;
/* Add a list of courses with the elements: Manual testing, Automated testing, Front-end, Java.
   Display the element on the second position and the length of the list.
   Write a method that displays all the elements. */

public class CourseList {
    // Static ArrayList to store the list of courses
    static ArrayList<String> courseList = new ArrayList<>();

    public static void main(String[] args) {
        // Adding courses to the list
        courseList.add("Manual testing");
        courseList.add("Automated testing");
        courseList.add("Front-end");
        courseList.add("Java");

        // Displaying the element at the second position in the list
        System.out.println("Element at the second position: " + courseList.get(1));

        // Displaying the length (number of elements) in the list
        System.out.println("Length of the course list: " + courseList.size());

        // Calling the method to display all elements in the list
        allElements(courseList);
    }

    // Method to display all elements in the course list
    public static void allElements(ArrayList<String> list) {
        // Iterating through the list and printing each element
        for (String allElements : list) {
            System.out.println(allElements);
        }
    }
}