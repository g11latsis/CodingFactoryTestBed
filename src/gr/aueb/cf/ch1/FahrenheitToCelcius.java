package gr.aueb.cf.ch1;

import java.util.Scanner;

/**
 * Πρόγραμμα που μετατρέπει ακέραιες θερμοκρασίες από Fahrenheit σε κλίμακα κελσίου
 *
 * @author Grigoris
 */
public class FahrenheitToCelcius {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fr,cl;

        System.out.println("Παρακαλώ εισάγετε έναν ακέραιο αριθμό θερμοκρασίας Fahrenheit:\n");
        fr = in.nextInt();

        cl = 5 * (fr - 32) / 9;

        System.out.printf("%d°F αντιστοιχούν σε %d°C", fr , cl);
    }
}
