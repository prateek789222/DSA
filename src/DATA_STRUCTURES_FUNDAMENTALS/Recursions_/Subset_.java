package DATA_STRUCTURES_FUNDAMENTALS.Recursions_;

import java.util.ArrayList;
import java.util.List;

public class Subset_ {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
//        int[] arr1 = Arrays.stream(arr).sorted().toArray();
        System.out.println(subsets(arr));
    }

    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<Integer>(), nums, 0);
        return result;
    }

    static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int index){
        if(index>=nums.length){

            result.add(new ArrayList<>(tempList)); // is a safer approach because it ensures that the subsets stored in the result list remain independent and unaffected by any modifications made to the tempList
//            result.add(tempList);
            return;
        }
        tempList.add(nums[index]);
        backtrack(result, tempList, nums, index+1); //considering
        tempList.remove(tempList.size()-1);
        backtrack(result, tempList, nums, index+1); //ignoring
    }
}