package DATA_STRUCTURES_FUNDAMENTALS.Search_n_Sort.Sorting_algos;

import java.util.Arrays;

public class Cyclic_sort {
    public static void main(String[] args) {
        int[] arr={6,10,1,5,4,7,2,9,3,8};
        System.out.println(Arrays.toString(cyclic(arr)));
    }

    private static int[] cyclic(int[] arr) {
        int i=0;
        while(i<arr.length-1){ //for n elements, only n-1 comparisons are required
            if(i!=arr[i]-1){ //check if element is in correct index or not, if no....
                swap(arr,i,arr[i]-1); //swap with correct index
            }else{
                i++; //else increment i value
            }
        }
        return arr;
    }
    static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
