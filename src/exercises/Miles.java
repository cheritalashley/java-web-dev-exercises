package src.exercises;

import java.util.Scanner;

public class Miles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven? ");
        int miles = input.nextInt();

        System.out.println("How much gas have you used? ");
        int gas = input.nextInt();

        System.out.println("You have consumed " + miles/gas + " miles/gallon");
    }

}
