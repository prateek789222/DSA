package DATA_STRUCTURES_FUNDAMENTALS.Array_;

import java.util.Arrays;

public class Input {
    public static void main(String[] args) {
         int[][] arr={{1,2,3},{4,5,},{7,8,9,10}};
        for (int row=0;row<arr.length;row++){
            System.out.println(" ");
            for (int col=0;col<arr[row].length;col++){
                System.out.print(" "+arr[row][col]);
            }
        }
        System.out.println("\n");

//        for (int row=0;row<arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }
        for (int[] i:arr
             ) {
            System.out.println(Arrays.toString(i));
        }

    }
}