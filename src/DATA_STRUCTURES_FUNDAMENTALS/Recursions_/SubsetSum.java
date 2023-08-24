package DATA_STRUCTURES_FUNDAMENTALS.Recursions_;

import java.util.ArrayList;

public class SubsetSum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        System.out.println(subsetSums1(arr));
    }

    static ArrayList<Integer> subsetSums1(ArrayList<Integer> arr) {
        int index = 0;
        int sum = 0;
        ArrayList<Integer> answer = new ArrayList<>();
        helper(arr, index, sum, answer);
        return answer;
    }

    static void helper(ArrayList<Integer> arr, int index, int sum, ArrayList<Integer> answer) {
        if (index >= arr.size()) {
            answer.add(sum);
            return;
        }
        helper(arr, index + 1, sum + arr.get(index), answer); //picking
        helper(arr, index + 1, sum, answer); //not picking
    }
}