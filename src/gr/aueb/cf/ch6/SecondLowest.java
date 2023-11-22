package gr.aueb.cf.ch6;

/**
 * Finds the second-lowest
 * element of an array
 */
public class SecondLowest {

    public static void main(String[] args) {

        int[] arr = {1, 2, 7, 15, 55, 3};
        int lowest = getSecondMinPosition(arr);
        System.out.println(lowest);
    }

    /**
     * @param arr the input array
     * @return Second-lowest value
     */
    public static int getSecondMinPosition(int[] arr) {
        if (arr == null) return -1;

        int temp = 0;

        //Sorting the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[1]; // Return the second element
    }
}