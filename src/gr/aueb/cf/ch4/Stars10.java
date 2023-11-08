package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εκτυπώνει N οριζόντια αστεράκια.
 */
public class Stars10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stars = 0;

        System.out.println("Please insert the number of stars:");
        stars = scanner.nextInt();

        if (stars > 0) {
            for (int i = 1; i <= stars; i++) {
                System.out.print("*");
            }
        } else {
            System.out.println("Error. Please insert a positive number");
        }
    }
}
