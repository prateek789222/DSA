package DATA_STRUCTURES_FUNDAMENTALS.Strings_;
//Leetcode_9
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Palindrome_ {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    static void palindrome() {
        int x = -99;
        String original = Integer.toString(x);
        String rev = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            rev += original.charAt(i);
        }
        if (original.equals(rev)) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("NON PALINDROME");
        }
    }

    //Leetcode_125
    static boolean isPalindrome(String n){
        String original=n.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String rev = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            rev += original.charAt(i);
        }
        System.out.println((rev));
        if (original.equals(rev)) {
            return true;
        } else {
            return false;
        }
    }
}
