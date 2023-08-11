package DATA_STRUCTURES_FUNDAMENTALS.Recursions_.Problems_recu;

import java.util.ArrayList;

public class LinearSearch_ArrayList {
    public static void main(String[] args) {
        ArrayList <Integer>a=new ArrayList<>();
        int[] arr={12,32,12,22,33,45,12,12};
        System.out.println(Ls_al(arr,12,0,a));
    }
    static ArrayList Ls_al(int[] arr, int tar, int i, ArrayList a){
        if(i==arr.length)
            return a;
        if(arr[i]==tar)
            a.add(i);
        return Ls_al(arr,tar,i+1,a);
    }
}
