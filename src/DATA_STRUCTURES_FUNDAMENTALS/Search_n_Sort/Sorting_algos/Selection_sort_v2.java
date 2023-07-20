package DATA_STRUCTURES_FUNDAMENTALS.Search_n_Sort.Sorting_algos;

import java.util.ArrayList;
import java.util.Arrays;

public class Selection_sort_v2 {
    public static void main(String[] args) {
        int[] arr1={2,5,1,5,50,3,21};
        System.out.println(Arrays.toString(Selectn_sort(arr1)));

    }

    private static int[] Selectn_sort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
           int minIndex=findMinIndex(arr,i,arr.length-1);
           swap(arr,i,minIndex);
        }
        return arr;
    }

    private static int findMinIndex(int[] arr, int s, int e) {
        int min=s;
        for(int i=s;i<=e;i++){
            if(arr[i]<arr[min])
                min=i;
        }
        return min;
    }
    static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }


}
