package DATA_STRUCTURES_FUNDAMENTALS.Recursions_;

import java.util.Arrays;

public class Merge_sort_inplace_ {
    public static void main(String[] args) {
        int[] arr = {2,3,1,5,6};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSortInPlace(int[] arr, int s, int e) {
        //base condition
        if (e - s == 1) {
            return;
        }

        //for halfing the array
        int mid = (s + e) / 2;

        //left part
        mergeSortInPlace(arr, s, mid);

        //right part
        mergeSortInPlace(arr, mid, e);

        //merging both the parts
        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}