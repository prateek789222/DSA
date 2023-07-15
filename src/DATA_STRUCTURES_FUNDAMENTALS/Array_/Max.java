package DATA_STRUCTURES_FUNDAMENTALS.Array_;

public class Max {
    public static void main(String[] args) {
        int[] arr={1,3,23,9,180,456,9};
        System.out.println(max(arr,2,5)); //prints max element of an array in a specific range
    }
    private static int max(int[] arr,int from,int to){
        //edge cases-----------------------------------
        if (to<from)
        {
            return -1;
        }
        if (arr==null||arr.length==0){
            return -1;
        }
        //---------------------------------------------
        int max=arr[0];
        for (int i=from;i<=to;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
