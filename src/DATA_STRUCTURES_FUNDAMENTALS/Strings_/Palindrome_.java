package DATA_STRUCTURES_FUNDAMENTALS.Strings_;

import java.util.Scanner;

public class Palindrome_ {
    public static void main(String[] args) {
        String original="mom";
        String rev="";
        for(int i=original.length()-1;i>=0;i--){
            rev+=original.charAt(i);
        }
        if(original.equals(rev)){
            System.out.println("PALINDROME");
        }
        else{
            System.out.println("NON PALINDROME");
        }
    }
}
