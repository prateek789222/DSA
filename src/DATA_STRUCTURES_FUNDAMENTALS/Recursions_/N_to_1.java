package DATA_STRUCTURES_FUNDAMENTALS.Recursions_;
public class N_to_1 {
    public static void main(String[] args) {
        n_to_1(5);
        System.out.println(" ");
        n_to_1_rev(5);

    }
    private static void n_to_1(int i) {
        if(i==0){
            return;
        }
        System.out.print(i+" ");
        n_to_1_rev(i-1);
    }
    private static void n_to_1_rev(int i) {
        if(i==0){
            return;
        }
        n_to_1_rev(i-1);
        System.out.print(i+" ");
    }
}