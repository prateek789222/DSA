package DATA_STRUCTURES_FUNDAMENTALS.Recursions_.Problems_recu;

import java.util.ArrayList;

public class Linear_search {
    public static void main(String[] args) {
        int[] arr={1,4,6,6,6,7,10,6};
        System.out.println(Ls(arr,6)); //find first occurence index
        Ls_all(arr,6);
        System.out.println(val); //to return all occurances
    }
    static int Ls(int[] arr,int tar){
        return helper(arr,tar,0);
    }

    static int helper(int[] arr,int tar,int i){
        if(i==arr.length)
            return -1;
        if(arr[i]==tar){
            val.add(i);
            return i;
            }
        else
            return helper(arr,tar,i+1);
    }

    //to return all occcurences:

    static void Ls_all(int[] arr,int tar){
        helperAll(arr,tar,0);
    }

    static ArrayList<Integer> val=new ArrayList<>();
    static void helperAll(int[] arr,int tar,int i){
        if(i==arr.length)
            return;
        if(arr[i]==tar)
            val.add(i);
        helperAll(arr,tar,i+1);
    }


}
