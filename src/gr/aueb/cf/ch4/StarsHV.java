package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εκτυπώνει N γραμμές με N stars η κάθε γραμμή.
 */
public class StarsHV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horizontalStars = 0;
        int verticalStars = 0;

        System.out.println("Please insert number of stars (Horizontal-Vertical):");
        horizontalStars = scanner.nextInt();
        verticalStars = scanner.nextInt();

        if (horizontalStars != 0 && verticalStars != 0) {
            for (int i = 1; i <= verticalStars; i++) {
                for (int j = 1; j <= horizontalStars; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("Error. Please insert positives numbers");
        }

    }
}
