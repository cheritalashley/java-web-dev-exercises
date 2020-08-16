package src.exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListPractice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the word to search: ");
        int num = input.nextInt();
        // Within main, create a list with at least 10 integers and call your method on the list.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        numbers.add(20);
        numbers.add(100);
        numbers.add(90);
        numbers.add(81);
        numbers.add(45);
        numbers.add(23);
        int sum = sumEvenNumbers(numbers);
        System.out.println("Sum: " + sum);

        ArrayList<String> words = new ArrayList<>();
        words.add("Hi this exercise is crazy");
        printWord(words, num);
    }

    //Write a static method to find the sum of all the even numbers in an ArrayList.
    public static int sumEvenNumbers(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }

    //Write a static method to print out each word in a list that has exactly 5 letters.
    //Modify your code to prompt the user to enter the word length for the search.
    public static void printWord(ArrayList<String> words, int num) {
        String[] listWords = new String[words.size()];
        words.toArray(listWords);
        String list = "";
        for(int i=0; i<listWords.length; i++){
            list+=listWords[i];
        }
        String[] myList = list.split(" ");
        for(String x:myList){
            if(x.length()==num){
                System.out.println(x);
            }
        }
    }

    //BONUS: Instead of creating our own list of words, what if we want to use the string from
    //the Array Practice section?

}
