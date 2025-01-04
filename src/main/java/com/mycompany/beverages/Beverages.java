package com.mycompany.beverages;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author oscaro
 */
public class Beverages {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String name;

        System.out.println("********** Welcome to the Bevarage Systems ********** \n Please, introduce your name: ");
        name = getValidEntrance(tec);

        boolean flag = false;

        int opcion;

        while (!flag) {

            try {

                System.out.println("********** Welcome to the Beverage Machine *********");
                System.out.println("Please, Choose an Option: ");
                System.out.println("1. Coffee");
                System.out.println("2. Milkshake");
                System.out.println("3. Soda");
                System.out.println("4. Wine");
                System.out.println("5. Water");
                System.out.println("6. None");

                opcion = tec.nextInt();
                tec.nextLine();

                switch (opcion) {
                    case 1 -> {

                        System.out.println("Coffeee!! Great choice!, Even it fits well with Java :D ");
                        System.out.println("Enjoy your Bevarage");

                    }

                    case 2 -> {

                        System.out.println("MilkShakes, thy are amaziiing!!! Enjoy it");
                        System.out.println("Enjoy your Bevarage!!");

                    }

                    case 3 -> {

                        System.out.println("Soda, it is okay, but be careful of sugar");
                        System.out.println("Enjoy your Bevarage!!");

                    }

                    case 4 -> {
                        System.out.println("Wine, it's Elegant for special Ocassions, have a blast!!");
                        System.out.println("Enjoy your Bevarage!!");

                    }
                    case 5 -> {

                        System.out.println("Water is life!!!! Never Stop Drinking Water");
                        System.out.println("Enjoy your Bevarage!!");

                    }

                    case 6 -> {
                        System.out.println("Thank you for using the Beverage System");
                    }

                    default -> {
                        System.out.println("Error, you must introduce a number");
                    }
                }

            } catch (InputMismatchException e) {

                tec.next();
                System.out.println("Error, you must introduce a number");
            }

            System.out.print("Would you like to choose another option? (y/n): ");
            String answer = tec.nextLine().toLowerCase();
            while (!answer.equals("y") && !answer.equals("n")) {
                System.out.println("Invalid Answer. Please, introduce 'y' or 'n'.");
                System.out.print("Would you like to choose another option? (y/n): ");
                answer = tec.nextLine().toLowerCase();
            }

            if (answer.equalsIgnoreCase("n")) {
                System.out.println("Thank you for visiting us " + name + " . . .");
                System.out.println("Enjoy your day!!");

                flag = true;
            }

        }

        tec.close();

    }

    private static String getValidEntrance(Scanner tec) {
        String entrance = tec.nextLine();
        while (Character.isDigit(entrance.charAt(0)) || isOperador(entrance.charAt(0))) {
            System.out.println("Error!! You must Introduce a valid String, not numbers or Operators.");
            entrance = tec.nextLine();
        }
        return entrance;
    }

    private static boolean isOperador(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '.' || c == ',' || c == ';';
    }
}
