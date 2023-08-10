package DATA_STRUCTURES_FUNDAMENTALS.Recursions_.Problems_recu;

public class Linear_search {
    public static void main(String[] args) {
        int[] arr={1,4,6,6,6,7,10};
        System.out.println(Ls(arr,6));
    }
    static int Ls(int[] arr,int tar){
        return helper(arr,tar,0);
    }
    static int helper(int[] arr,int tar,int i){
        if(i==arr.length)
            return -1;
        if(arr[i]==tar)
            return i;
        else
            return helper(arr,tar,i+1);
    }
}
