package DATA_STRUCTURES_FUNDAMENTALS.Recursions_;

public class Fibonacci_series {
    //0,1,1,2,3,5,8....
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            System.out.print(fibo(i)+" ");
        }
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}

