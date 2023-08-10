package DATA_STRUCTURES_FUNDAMENTALS.Recursions_.Problems_recu;
//to check if an array is sorted or not using recursion

public class Sorted_or_not {
    public static void main(String[] args) {
        int[] arr={1,4,6,6,20,100};
        System.out.println(Sorted(arr));
    }
    static boolean Sorted(int[] arr){
        if(helper(arr,0)==1)
            return true;
        return false;
    }
    static int helper(int[] arr,int i){
        if(i==arr.length-1){
            return 1;
        }
        if(arr[i]<=arr[i+1]) {
            return helper(arr, i+1);
        }
        else
            return 0;
    }
}
