package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * Decrypt an ecrypted string
 */
public class decryptApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string to Encrypt :");
        String str = sc.nextLine();

        System.out.println(encrypt(str));
    }

    /**
     * @param str   Given string
     * @return      The decrypted string
     */
    public static String encrypt(String str) {
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int ascii = (int) c - 1;

            encrypted.append((char) ascii);
        }
        return encrypted.toString();
    }

}
