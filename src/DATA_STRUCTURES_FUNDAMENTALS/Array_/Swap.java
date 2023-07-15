package DATA_STRUCTURES_FUNDAMENTALS.Array_;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr={1,3,23,9,18};
//        swap(arr,0,4); //swaps array elements
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int ind1,int ind2){
        int temp=arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=temp;
    }

    static void reverse(int[] arr){ //using 2 pointer method
        int start=0;
        int end= arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}