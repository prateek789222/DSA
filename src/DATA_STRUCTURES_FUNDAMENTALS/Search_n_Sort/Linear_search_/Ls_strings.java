package DATA_STRUCTURES_FUNDAMENTALS.Search_n_Sort.Linear_search_;

import java.util.Arrays;

public class Ls_strings {
    public static void main(String[] args) {
        String name="prateek";
        char target='q';
        System.out.println(search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search(String name,char target){
        if (name.length()==0){
            return false;
        }
//        for (int i=0;i<name.length();i++){
//            if (target==name.charAt(i))
//                return true;
//        }

        for (char x:name.toCharArray()) {
            if (target==x)
                return true;
        }

     return false;
    }

}
