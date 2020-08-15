package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        String radius = input.nextLine();

        //Using regular expressions
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(radius);
        if(matcher.find()){
            System.out.println("Radius cannot be a letter");
        } else if (radius.equals("")){
            System.out.println("Radius must be a value");
        } else {
            double radiusDouble = Double.parseDouble(radius);
            if (radiusDouble < 0) {
            System.out.println("Radius must be a positive number");
            } else {
            double area = Circle.getArea(radiusDouble);
            System.out.println("The area of a circle of radius " + radius + " is: " + area);
            }
        }
    }

}
