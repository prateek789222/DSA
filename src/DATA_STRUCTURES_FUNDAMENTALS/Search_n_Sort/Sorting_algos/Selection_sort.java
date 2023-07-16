package DATA_STRUCTURES_FUNDAMENTALS.Search_n_Sort.Sorting_algos;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr={4,5,1,2,3,7,10,6,8,9};
        System.out.println(Arrays.toString(insertion_sort(arr)));
    }

    private static int[] insertion_sort(int[] arr) {
        for (int i = 0; i <arr.length; i++) { //total n-1 iterations are required as first element will be sorted
            // automatically
             //As for n elements, n-1 comparisons are needed.
                int lastIndex=(arr.length-1)-i; //For every iteration we should
            // leave the already sorted elements in
            // right extreme, and compare and swap for the remaining elements to the next last index.
            // "Hence: lastindex= (arr.len-1)-i"=(lastindexval-i)
                int maxIndex=findMaxIndex(arr,0,lastIndex); //finds the index with maximum element in the remaining
            // part of unsorted array elements
                swap(arr,maxIndex,lastIndex); //performs swapping of the max element with the "next" last element
        }
        return arr;
    }
    static void swap(int[] arr,int maxIndex,int lastIndex){
        int temp=arr[lastIndex];
        arr[lastIndex]=arr[maxIndex];
        arr[maxIndex]=temp;
    }

    private static int findMaxIndex(int[] arr, int start, int end) {
        int max=start;
        for (int i=start;i<=end;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
}
