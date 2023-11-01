package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εκτυπώνει 1 star στη 1η γραμμή, 2 stars στη 2η γραμμή,
 * 3 stars στη 3η γραμμή, κ.ο.κ.
 */
public class StarsAsc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Please insert an integer");
        num = scanner.nextInt();

        if (num > 0) {
            for (int i = num; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("Error. Please insert a positive number");
        }
    }
}
