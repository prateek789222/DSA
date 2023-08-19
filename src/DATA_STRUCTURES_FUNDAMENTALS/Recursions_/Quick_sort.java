package DATA_STRUCTURES_FUNDAMENTALS.Recursions_;

import java.util.Arrays;

public class Quick_sort {
    public static void main(String[] args) {
        int[] arr={5,4,3,1,2};
        quick_sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quick_sort(int[] arr,int low,int high){
        //base condition
        if(low>=high){ //if only one element left, return that element
            return;
        }

        int i=low;
        int j=high;
        int m=low+(high-low)/2;
        int pivot=arr[m];

        while(i<=j) { //run till i and j dont cross

            // (smaller elements)[pivot](larger elements) \\ this is the correct position of pivot

            while (arr[i] < pivot) { //keep incrementing till violation is found
                i++;
            }
            while (arr[j] > pivot) { //keep incrementing till violation is found
                j--;
            }
            if(i<=j){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        quick_sort(arr,low,j);
        quick_sort(arr,i,high);
    }

    static void swap(int[] array, int x, int y){
        int temp=array[x];
        array[x]=array[y];
        array[y]=temp;
    }

}