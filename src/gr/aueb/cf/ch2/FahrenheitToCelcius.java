package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Πρόγραμμα που μετατρέπει ακέραιες θερμοκρασίες
 * από Fahrenheit σε κλίμακα κελσίου.
 *
 * @author Grigoris
 */
public class FahrenheitToCelcius {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fahrenheit,celsius;

        System.out.println("Παρακαλώ εισάγετε έναν ακέραιο αριθμό θερμοκρασίας Fahrenheit:\n");
        fahrenheit = in.nextInt();

        celsius = 5 * (fahrenheit - 32) / 9;

        System.out.printf("%d°F αντιστοιχούν σε %d°C.", fahrenheit , celsius);
    }
}
