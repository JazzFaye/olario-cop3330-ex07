/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

import java.util.Scanner;   //using class scanner

public class App {

    public static void main(String[] args) {
        // main method begins execution of Java application
        Scanner rectangle = new Scanner(System.in); //Scanner to obtain input

        System.out.println("What is the length of the room in feet? ");
        double length = rectangle.nextDouble(); //Reads the room length from the user

        System.out.println("What is the width of the room in feet? ");
        double width = rectangle.nextDouble();  //Reads the room width from the user
        //Displays the room length and width
        System.out.printf("You entered dimensions of %.0f feet by %.0f feet.", length, width);

        double area = length * width;   //Formula to get the area of the room
        final double constant = 0.09290304; //Constant to hold conversion factor
        double convert = area * constant;   //Formula to convert the area from square feet to square meters

        System.out.println("\nThe area is");
        System.out.printf("%.0f square feet", area );   //Displays the area in square feet
        System.out.printf("\n%.3f square meters", convert); //Displays the area in square meters



    }
}