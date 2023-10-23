package gr.aueb.cf.ch3;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;

        System.out.println("Please insert a year:");
        year= in.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0 ){
            System.out.printf("%d is a Leap Year",year);
        }else {
            System.out.printf("%d isn't a Leap Year", year);
        }
    }
}
