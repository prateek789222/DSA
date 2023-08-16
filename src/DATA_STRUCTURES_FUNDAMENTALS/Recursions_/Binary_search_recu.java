package DATA_STRUCTURES_FUNDAMENTALS.Recursions_;

public class Binary_search_recu {
    public static void main(String[] args) {
        int[] arr={12,16,19,20,25};
        System.out.println(bs_recu(arr,19,0,arr.length-1));
    }

    static int bs_recu(int[] arr, int target, int s, int e) {
        if(s>e) return -1;
        int m=s+(e-s)/2;
        if (target==arr[m]) return m;
        else if(target<arr[m]) return bs_recu(arr,target,s,m-1);
        else return bs_recu(arr,target,m+1,e);
    }

}
