package src.exercises;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of rectangle? ");
        int length = input.nextInt();

        System.out.println("What is the width of rectangle? ");
        int width = input.nextInt();

        System.out.println("The area of the rectangle is " + width*length);

    }
}
