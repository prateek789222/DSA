package DATA_STRUCTURES_FUNDAMENTALS.Recursions_.Problems_recu;

public class Count_zeroes {
    public static void main(String[] args) {
        System.out.println(count_zero(100900920));
    }
    static int count_zero(int n){
        return helper(n,0);
    }
    static int helper(int n,int c){
        if(n == 0 || n%10==n)
            return c;
        if(n%10==0)
            return helper(n/10,c+1);
        else
            return helper(n/10,c);
    }
}