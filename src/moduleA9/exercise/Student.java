package moduleA9.exercise;

import java.util.HashMap;

/* Add a new dictionary with student names with key-value elements: studentName(String)-examPass(Boolean).
   Add 5 elements with different values.
   Add a method to display only students who pass the exam. */
public class Student {
    static HashMap<String, Boolean> student = new HashMap<>();

    public static void main(String[] args) {
        // Adding students and their exam pass status to the dictionary
        student.put("Ion", true);
        student.put("Vasile", true);
        student.put("Radu", false);
        student.put("Raul", true);
        student.put("Bogdan", false);

        // Displaying the names of students who passed the exam
        passExam();
    }

    // Method to display names of students who passed the exam
    public static void passExam() {
        // Variable to track if any student passed the exam
        boolean studentPassed = false;

        // Iterating through the entries and checking if the student passed the exam
        for (HashMap.Entry<String, Boolean> passStudent : student.entrySet()) {
            if (passStudent.getValue()) {
                // If at least one student passed, print the name
                System.out.println(passStudent.getKey());
                studentPassed = true;
            }
        }

        // If no student passed the exam, print a message
        if (!studentPassed) {
            System.out.println("No student passed the exam!");
        }
    }
}
