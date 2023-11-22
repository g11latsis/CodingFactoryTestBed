package gr.aueb.cf.ch6;

/**
 * Finds the maximum element of a range of the array
 * and returns the position it is in.
 */
public class ArrayMax {

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 15, 5, 10, 45};
        int maxPosition = 0;

        maxPosition = getMaxPosition(arr, 0, arr.length - 1);
        System.out.printf("Largest element is the %d and is in position %d. ",
                arr[maxPosition], maxPosition + 1);
    }

    /**
     * @param arr  the input array
     * @param low  the initial value of the range
     * @param high the final value of the range
     * @return the position were the largest element found
     */
    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPosition = low;
        int maxValue;

        if (arr == null) return -1;
        if (low < 0 || high > arr.length - 1) return -1;


        maxValue = arr[low];
        for (int i = low; i <= high; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxPosition = i;
            }
        }
        return maxPosition;
    }
}
