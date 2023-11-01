package gr.aueb.cf.ch4;

import java.util.Scanner;

public class StarsDsc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Please insert an integer");
        num = scanner.nextInt();

        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                for (int j = num; j >= i; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("Error. Please insert a positive number");
        }
    }
}

