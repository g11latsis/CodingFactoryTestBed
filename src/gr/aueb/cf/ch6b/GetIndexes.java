package gr.aueb.cf.ch6b;

/**
 * Find first and last positions
 * of an element in a sorted array
 */
public class GetIndexes {

    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int[] results = getLowAndHighIndexOf(arr, 8);
        System.out.printf("First appearance in position: %d , Last appearance in position: %d ", results[0], results[1]);
    }

    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int[] res = {-1, -1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                if (res[0] == -1)
                    res[0] = i;
                res[1] = i;
            }
        }
        return res;
    }

}
