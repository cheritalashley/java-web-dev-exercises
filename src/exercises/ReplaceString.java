package exercises;

import java.util.Scanner;

public class ReplaceString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String phase = "Alice was beginning to get very tired of sitting by her" +
                "sister on the bank, and of having nothing to do: once" +
                "or twice she had peeped into the book her sister was" +
                "reading, but it had no pictures or conversations in it," +
                "'and what is the use of a book,' thought Alice 'without" +
                "pictures or conversation?'";
        System.out.println("Enter Search: ");
        String search = input.nextLine();
        int searchLength = search.length();

        if(phase.toLowerCase().contains(search.toLowerCase())){
            int index = phase.indexOf(search);
            System.out.println("Search Length: " + searchLength);
            System.out.println("Index of Search String: " + index);
            String newPhase = phase.replace(search, "");
            System.out.println(newPhase);
        }else{
            System.out.println(search + " was not found");
        }

    }
}
