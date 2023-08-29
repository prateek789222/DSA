package DATA_STRUCTURES_FUNDAMENTALS.Search_n_Sort.Sorting_algos;

import java.util.Arrays;

public class Merge_sort {
    public static void main(String[] args) {
        int[] arr1 = {5,4,3,2,1};
        System.out.println(Arrays.toString(mergeSort(arr1)));
    }

    static int[] mergeSort(int[] arr) {

        //base condition
        if(arr.length==1)
            return arr;

        //compute the mid to half the array
        int mid=arr.length/2;

        //differentiate into left and right subparts
        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid)); //create a copy of the array passed,mid not included
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length)); //" " ,arr.length not included

        //merge the parts and return above
        return merge(left,right);
    }

    static int[] merge(int[] left,int[] right){
        int i=0;
        int j=0;
        int k=0;

        //the resultant array after merging left and right arrays
        int[] mix=new int[left.length+right.length];

        while(i<left.length && j<right.length) {
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        //for remaining elements
            if(i!=left.length){
                while(i<left.length){
                    mix[k]=left[i];
                    i++;
                    k++;
                }
            }
            if(j!=right.length){
                while(j<right.length){
                    mix[k]=right[j];
                    j++;
                    k++;
                }
            }
        return mix;
    }
}