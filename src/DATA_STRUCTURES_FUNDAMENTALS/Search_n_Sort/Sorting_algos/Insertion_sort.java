package DATA_STRUCTURES_FUNDAMENTALS.Search_n_Sort.Sorting_algos;

import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1,0};
        System.out.println(Arrays.toString(insert_sort(arr)));
    }

    static int[] insert_sort(int[] arr) {
        for (int i = 0; i <arr.length-1; i++) { //i will perform arr.len-1 comparisons

            for(int j=i+1;j>0;j--){ //j will start one place further than i initially. Its job is to take an element
                // and comapare it with elements in sorted part of array, if it is smaller-> then take it to its
                // appropriate position, else loop break.
                // If it reaches index 0, loop breaks.
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
        return arr;
    }
    static int[] swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }
}
