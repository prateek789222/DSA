package DATA_STRUCTURES_FUNDAMENTALS.Search_n_Sort.Linear_search_;

import java.util.Arrays;

public class _2D_arr {
    public static void main(String[] args) {
        int[][] arr={{30,20,40,28},{70,320,45,94},{74,37,92,83},{282,484,32,32}};
        for (int i=0;i< arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("element found at [row:column]: "+Arrays.toString(search(arr,32)));
    }
    static int[] search(int[][] arr,int target){
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (target==arr[i][j]){
                        return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}