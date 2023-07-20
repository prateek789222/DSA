package DATA_STRUCTURES_FUNDAMENTALS.Strings_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strings1 {
    public static void main(String[] args) {
//        StringBuilder sb=new StringBuilder();
//        for(int i=0;i<26;i++){
//            char ch=(char)('a'+i); //typecasting int to char
//            sb.append(ch);
//        }
//        System.out.println(sb.reverse());

        String name="prateek";
        System.out.println(Arrays.toString(name.toUpperCase().toCharArray()));
        System.out.println(name.indexOf('r'));
    }
}
