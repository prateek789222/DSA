package DATA_STRUCTURES_FUNDAMENTALS.Recursions_.Problems_recu;

public class Factorial_num {
    public static void main(String[] args) {
        System.out.println(fact(9));
    }
    static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
}
