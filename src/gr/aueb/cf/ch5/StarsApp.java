package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Print multiple stars patterns
 */
public class StarsApp {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        int starsNumber = 0;

        do {
            printMenu();
            choice = getUserChoice();

            if (choice < 1 || choice > 6) {
                System.out.println("Λαθος επιλογή!");
                continue;
            }

            if (choice != 6) {
                System.out.println("Εισάγετε αριθμό αστεριών:");
                starsNumber = getStarsNumber();

                switch (choice) {
                    case 1:
                        starsHorizontal(starsNumber);
                        break;
                    case 2:
                        starsVertical(starsNumber);
                        break;
                    case 3:
                        starsTwoDimensions(starsNumber);
                        break;
                    case 4:
                        starsAsc(starsNumber);
                        break;
                    case 5:
                        starsDsc(starsNumber);
                        break;
                    default:
                        break;
                }
            }
        } while (choice != 6);
    }

    public static void printMenu() {
        System.out.println("Επιλέξτε:");
        System.out.println("1.Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2.Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3.Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4.Εμφάνισε n γραμμές με αστεράκια 1 – n");
        System.out.println("5.Εμφάνισε n γραμμές με αστεράκια n – 1");
        System.out.println("6.Έξοδος από το πρόγραμμα");
    }

    public static int getUserChoice() {
        return in.nextInt();
    }

    public static int getStarsNumber() {
        return in.nextInt();
    }

    public static void starsHorizontal(int stars) {
        for (int i = 1; i <= stars; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void starsVertical(int stars) {
        for (int i = 1; i <= stars; i++) {
            System.out.println("*");
        }
        System.out.println();
    }

    public static void starsTwoDimensions(int stars) {
        for (int i = 1; i <= stars; i++) {
            starsHorizontal(stars);
        }
    }

    public static void starsAsc(int stars) {
        for (int i = 1; i <= stars; i++) {
            starsHorizontal(i);
        }
    }

    public static void starsDsc(int stars) {
        for (int i = stars; i >= 1; i--) {
            starsHorizontal(i);
        }
    }
}

