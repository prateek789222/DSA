package DATA_STRUCTURES_FUNDAMENTALS.Search_n_Sort.Linear_search_;

public class min {
    public static void main(String[] args) {
        int[] arr={-21,85,564,83,865,0,-1};
        System.out.println("minimum number is: "+mini(arr));

    }
    static int mini(int[] arr){
        int m=arr[0];
        for (int x:arr) {
            if (x<=m)
                m=x;
        }
        return m;
    }
}
