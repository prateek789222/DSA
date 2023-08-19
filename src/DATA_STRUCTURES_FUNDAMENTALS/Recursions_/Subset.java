package DATA_STRUCTURES_FUNDAMENTALS.Recursions_;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println(ss(array));
    }

    static List<List<Integer>> ss(int[] arr){

        List<List<Integer>> outer = new ArrayList<>(); //create the outer list (list of lists)
        outer.add(new ArrayList<>()); //initially add an empty list to outer

        for(int ele : arr){   //For each element ele, in arr = ex. [1,2,3]
            int n = outer.size();   //Gets the current size of the list outer.
            for (int i = 0; i < n ; i++) {  //if outer list has n lists, create n more duplicate lists
                List<Integer> internal = new ArrayList<>(outer.get(i));   //Creates a new list(internal) that is a
                                                                            // copy of the list outer.get(i)
                internal.add(ele);   //Adds the element ele to the list internal
                outer.add(internal);  //Adds the list internal to the list outer
            }
        }
        return outer;
    }
}


//          i =   0      1      2
//outer      [  [9,1], [8,2], [7,3], ]         outer.get(0) =  [9,1]