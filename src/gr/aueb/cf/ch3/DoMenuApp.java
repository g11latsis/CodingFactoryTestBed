package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εφαρμογή που τυπώνει επαναληπτικά ένα μενού
 * έως ότου ο χρήστης πατήσει 5.
 *
 * @author Grigoris
 */
public class DoMenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("1.Εισαγωγή");
            System.out.println("2.Διαγραφή");
            System.out.println("3.Ενημέρωση");
            System.out.println("4.Αναζήτηση");
            System.out.println("5.Έξοδος");

            choice = in.nextInt();

            if (choice == 1){
                System.out.println("Επιλέξατε εισαγωγή");
            } else if (choice == 2) {
                System.out.println("Επιλέξατε διαγραφή");
            } else if (choice == 3) {
                System.out.println("Επιλέξατε ενημέρωση");
            } else if (choice == 4) {
                System.out.println("Επιλέξατε διαγραφή");
            }else if (choice == 5) {
                System.out.println("Επιλέξατε Έξοδος");
                break;
            }else {
                System.out.println("Εισάγετε έναν αριθμό από 1-5");
            }

        }while(choice != 5);
    }
}
