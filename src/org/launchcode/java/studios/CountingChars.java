package src.org.launchcode.java.studios;

import src.exercises.HashMapGradebookExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingChars {

    public static void main(String[] args) {
        HashMap<Character, Integer> countingChar = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phase to count: ");
        String phase = input.nextLine();
        String phasetoLowerCase = phase.toLowerCase();
        char[] charInString = phasetoLowerCase.toCharArray();

        for (char letter:charInString){
            if(countingChar.containsKey(letter)){
                countingChar.put(letter, countingChar.get(letter) + 1);
            }else{
                countingChar.put(letter, 1);
            }
        }

        for(Map.Entry<Character, Integer> oneChar : countingChar.entrySet()){
            System.out.println(oneChar.getKey() + ": " + oneChar.getValue());
        }

    }
}
