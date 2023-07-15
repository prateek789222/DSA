package DATA_STRUCTURES_FUNDAMENTALS.Array_;

import java.util.Arrays;

public class array1 {
    public static void main(String[] args) {
        // array syntax:
        //  datatype [] variable_name = new datatype [size];
        //  store 5 roll numbers
        String[] arr=new String[5];
        arr[0]="Prateek";
        arr[1]=null;
        System.out.println(arr[0]);
        int[] arr2={10,40,60,80};
        System.out.println(arr2.length);
        System.out.println(Arrays.toString(arr2));
    }
}