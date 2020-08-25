package src.org.launchcode.java.studios.charcounts;
/*In this studio, you will write a program to count the number of times each
        character occurs in a string and then print the results to the console.
        1. There are multiple ways to approach this task, but one way involves the following steps:
        a. Loop through the string one character at a time,
        b. Store and/or update the count for a given character using an appropriate data structure.
        c. Loop through the data structure to print the results (one character and its count per line).
         2. Which type of data structure (ArrayList, HashMap, or Array) should you use to store
        character counts? Any can be made to work, but there is a BEST choice.
         3. You’ll need to initialize the counts for the characters in some fashion.
            It’s probably better to do this as you go through the string instead of doing so
            before you loop through it. (WHY?)*/

import java.net.InetSocketAddress;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CharsCounts {
    public static void main(String[] args) {

        HashMap<Character, Integer> characterCounts = new HashMap<>();
        String testString = "If the product of two terms is zero then common sense says at least one of " +
                "the two terms has to be zero to start with. So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored allowing that side of the equation " +
                "to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        String test="I am great";
        char[] charactersInString = test.toCharArray();

        for (char character : charactersInString) {
            if (characterCounts.containsKey(character)) {
                characterCounts.put(character, characterCounts.get(character) + 1);
            }
            else {
                characterCounts.put(character, 1);
            }
        }
        for (Map.Entry<Character, Integer> oneChar : characterCounts.entrySet()) {
            System.out.println(oneChar.getKey() + ": " + oneChar.getValue());
        }
    }
}
