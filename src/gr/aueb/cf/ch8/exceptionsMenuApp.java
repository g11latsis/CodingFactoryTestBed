package gr.aueb.cf.ch8;

import java.util.Scanner;

public class exceptionsMenuApp {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;

        do {
            try {
                printMenu();
                System.out.println("Please enter your choice:");
                choice = getChoice();
                printChoice(choice);
            } catch (IllegalArgumentException e) {
                System.out.println("Please enter an option between 1 and 5.");
            }
        } while (choice != 5);

        System.out.println("See you later!");
    }

    public static void printMenu() {
        System.out.println("1.Learn Java");
        System.out.println("2.Learn Python");
        System.out.println("3.Learn C#");
        System.out.println("4.Learn all of them");
        System.out.println("5.Exit");
        System.out.println();
    }

    public static int getChoice() {
        while (true) {
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.println("Please enter a valid option.");
                sc.nextLine();
            }
        }
    }

    public static void printChoice(int choice) {
        if (choice > 0 && choice < 6) {
            System.out.println("You select option " + choice);
        } else throw new IllegalArgumentException();
    }
}
