package DATA_STRUCTURES_FUNDAMENTALS.Recursions_.Problems_recu;

public class Sum_of_digits {
    public static void main(String[] args) {
        System.out.println(S_o_d(923));
        System.out.println(P_o_d(923));
    }

    static int P_o_d(int i) {
        if(i%10 == i){
            return i;
        }
        return  i%10 * P_o_d(i/10);
    }

    static int S_o_d(int i) {
        if(i == 0){
            return 0;
        }
        return  i%10 + S_o_d(i/10);
    }

}
