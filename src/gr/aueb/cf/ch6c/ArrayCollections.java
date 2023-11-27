package gr.aueb.cf.ch6c;

import java.util.*;
/**
 * Check an array of integers for the following predicates.
 * No more than 3 evens
 * No more than 3 odds
 * No more than 3 consecutive
 * No more than 3 with same ending
 * No more than 3 i  the same ten
 */
public class ArrayCollections {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] empty = null;
        System.out.println("Please insert 6 integers from 1 to 49:");
        int[] fillArr = arrayFill(sc);
        /*int[] fillArr = {11, 15, 16, 12, 14, 6};*/
        print(fillArr);
        System.out.println("Array doesn't have more than 3 evens : " + moreThanThreeEvens(fillArr));
        System.out.println("Array doesn't have more than 3 odds : " + moreThanThreeOdds(fillArr));
        System.out.println("Array doesn't have more than 3 consecutive numbers : " + moreThanThreeConsecutive(fillArr));
        System.out.println("Array doesn't have more than 3 numbers with same ending : " + moreThanThreeSameEndings(fillArr));
        System.out.println("Array doesn't have more than 3 numbers with same ten : " + moreThanThreeSameTen(fillArr));

    }

    public static boolean moreThanThreeEvens(int[] arr) {
        if (arr == null) return false;
        int evens = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evens++;
            }
        }
        return !(evens > 3);
    }

    public static boolean moreThanThreeOdds(int[] arr) {
        if (arr == null) return false;
        int odds = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                odds++;
            }
        }
        return !(odds > 3);
    }

    public static boolean moreThanThreeConsecutive(int[] arr) {
        if (arr == null) return false;
        int cons = 0;
        for (int i = 0; i < arr.length - 3; i++) {
            if ((arr[i] == arr[i + 1] - 1) && (arr[i] == arr[i + 2] - 2)) {
                cons++;
            }
        }
        return !(cons >= 1);
    }

    public static boolean moreThanThreeSameEndings(int[] arr) {
        if (arr == null) return false;
        int[] endings = new int[10];
        boolean hasSameEndings = false;

        for (int num : arr) {
            endings[num % 10]++;
        }
        for (int num : endings) {
            if (num >= 3) {
                hasSameEndings = true;
                break;
            }
        }
        return !hasSameEndings;
    }

    public static boolean moreThanThreeSameTen(int[] arr) {
        if (arr == null) return false;
        int[] dedimals = new int[10];
        boolean hasSameDecimal = false;

        for (int num : arr) {
            int decimalPlace = (num / 10) % 10;

            dedimals[decimalPlace]++;

            if (dedimals[decimalPlace] > 3) {
                return hasSameDecimal;
            }
        }
        return !hasSameDecimal;
    }

    public static void print(int[] arr) {
        if (arr == null) {
            System.out.println("Empty array!");
            return;
        }
        System.out.println("The integers you entered are:");
        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static int[] arrayFill(Scanner sc) {
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            int userInput = 0;
            boolean validValue = false;

            do {
                System.out.print("Enter integer " + (i + 1) + ": ");
                userInput = sc.nextInt();

                if (userInput >= 1 && userInput <= 49) {
                    validValue = true;
                } else {
                    System.out.println("Please enter a number between 1 and 49.");
                }
            } while (!validValue);

            arr[i] = userInput;
        }
        return arr;
    }

}



