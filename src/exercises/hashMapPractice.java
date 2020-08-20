package src.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashMapPractice {
    public static void main(String[] args) {

        //Make a program similar to GradebookHashMap that does the following:
        //It takes in student names and ID numbers (as integers) instead of names and grades.
        //The keys should be the IDs and the values should be the names.
        //Modify the roster printing code accordingly.
        HashMap<Integer, String> classRoster = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students' names and ID numbers (or ENTER to finish):");

        // Get student names and IDs
        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                classRoster.put(newID, newStudent);

                // Read in the new line before looping back
                input.nextLine();
            }
        } while(!newStudent.equals(""));

        input.close();

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : classRoster.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        System.out.println("Number of students in roster: " + classRoster.size());


    }
}