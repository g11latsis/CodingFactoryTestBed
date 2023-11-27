package gr.aueb.cf.ch6b;

import java.util.Arrays;
import java.util.Comparator;

public class ParkingLot {

    public static void main(String[] args) {
        int[][] arr = {{1012, 1136}, {1317, 1417}, {1015, 1020},{1014, 1030}};
        int[][] newArr = arrayConversion(arr);
        print2DArray(newArr);

        System.out.printf("Max cars parked at the same time: %d", getMaxCars(newArr));

    }

    public static int getMaxCars(int[][] arr) {
        if (arr == null) return -1;
        int currentCars = 0;
        int maxCars = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][1] == 1) {
                currentCars++;
            } else {
                if (currentCars > maxCars) {
                    maxCars = currentCars;
                }
                currentCars--;
            }
        }
        return maxCars;
    }

    public static int[][] arrayConversion(int[][] arr) {
        if (arr == null) return null;
        int[][] newArr = new int[arr.length * 2][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                newArr[2 * i][0] = arr[i][0];
                newArr[2 * i][1] = 1;
                newArr[2 * i + 1][0] = arr[i][j];
                newArr[2 * i + 1][1] = 0;
            }
        }
        Arrays.sort(newArr, Comparator.comparingInt(a -> a[0]));
        return newArr;
    }

    public static void print2DArray(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
