package exercises;

import java.util.Scanner;

public class HelloWorld {

    public static String getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your name? ");
        String name = input.nextLine();
        return name;
    }
}
