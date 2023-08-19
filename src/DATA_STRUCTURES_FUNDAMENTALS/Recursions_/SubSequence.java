package DATA_STRUCTURES_FUNDAMENTALS.Recursions_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSequence {
    public static void main(String[] args) {
        subsequ("","abc");

        System.out.println(" ");

        subseq("","abc");
        System.out.println(lis);

        System.out.println(subseqAL("","abc"));
    }
//--------------------------------------------1st method------------------------------------------------------
    static void subsequ(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch=up.charAt(0);

        subsequ(p + ch,up.substring(1));
        subsequ(p ,up.substring(1));
    }


//----------------------------------------------2nd method-------------------------------------------------------

    static List<String> lis = new ArrayList<>();

    static void subseq(String p, String up){
        if(up.isEmpty()){
            lis.add(p);
            return;
        }
        char ch=up.charAt(0);

        subseq(p + ch,up.substring(1));
        subseq(p ,up.substring(1));
    }
//----------------------------------------2nd method---------------------------------------------------------
    static ArrayList subseqAL(String p, String up){

        //base condition: just returning the answer
        if(up.isEmpty()){
            ArrayList<String> al=new ArrayList<>();  //creating a local AL
            al.add(p);                              //Adding the answer to the local AL
            return al;                              //returning the local AL
        }
        char ch=up.charAt(0);
        ArrayList<String> left = subseqAL(p + ch, up.substring(1)); //considering the first char of up
        ArrayList<String> right = subseqAL(p , up.substring(1)); //ignoring the first char of up

        left.addAll(right); //appending the left and right part answers
        return left; //returning the answer
    }
}
