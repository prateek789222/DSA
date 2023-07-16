package DATA_STRUCTURES_FUNDAMENTALS.Search_n_Sort;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] arr2={};
        System.out.println(Arrays.toString(bubble_sort(arr)));
    }
    static int[] bubble_sort(int[] arr) {
        if (arr.length != 0) {
            int temp;
            boolean swap=false;
            for (int i = 0; i <arr.length-1 ; i++) { //will run n-1 times, as when all larger elements are sorted,
                // the first element will be automatically sorted

                for (int j = 0; j < arr.length-1-i; j++) { //will perform n-1 comparisons obviously, and after every
                    // i iteration, no need to compare with the already sorted larger element int the right extreme.
                    // Therefore after every i itn., j will compare one time lesser. This signifies after every itn.
                    // a larger element is getting sorted
                    if (arr[j + 1] < arr[j]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swap=true;
                    }
                }
                if(!swap)
                    break;
            }

            return arr;
        }
        else
            return null;
    }
}
//[5,2,1,3,4]-->('i=0')-->[2,1,3,4,|5]-->('i=1')-->[2,1,3,|4,5]-->('i=2')-->[2,1,|3,4,5]-->('i=3')-->[1,|2,3,4,5]==>[1,2,3,4,5]
//<----j---->           <---j--->              <--j-->                <-j->                  <j>