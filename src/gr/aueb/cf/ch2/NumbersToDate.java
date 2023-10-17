package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Εκτύπωση ημερομηνίας σε μορφή
 * ΗΗ/ΜΜ/ΕΕ δεδομένων 3 ακέραιων.
 *
 * @author Grigoris
 */
public class NumbersToDate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day,month,year;

        System.out.println("Παρακαλώ εισάγετε τρεις ακέραιους αριθμούς:");
        day = in.nextInt();
        month = in.nextInt();

        //Με την χρήση του τελεστή % παίρνουμε τα 2 τελευταία ψηφία του έτους
        year = in.nextInt() % 100;

        System.out.printf("%02d/%02d/%02d" , day,month,year);
    }
}
