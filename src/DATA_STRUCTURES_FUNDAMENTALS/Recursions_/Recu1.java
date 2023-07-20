package DATA_STRUCTURES_FUNDAMENTALS.Recursions_;
public class Recu1 {
    public static void main(String[] args) {
        fun(1);
    }
    static void fun(int n){
        System.out.println(n);
        if(n == 5){
            return;
        }
        fun(n+1); //recursion
    }

}
