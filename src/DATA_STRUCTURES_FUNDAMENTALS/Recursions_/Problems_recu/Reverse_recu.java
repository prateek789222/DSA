package DATA_STRUCTURES_FUNDAMENTALS.Recursions_.Problems_recu;

public class Reverse_recu {
    public static void main(String[] args) {
        int num=808;
        rev(num);
        if(num==sum)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
    static int sum=0;
    static void rev(int n){
        if(n==0)
            return;
        int rem=n%10;
        sum=sum*10+rem;
        rev(n/10);
    }
}
