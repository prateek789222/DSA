package DATA_STRUCTURES_FUNDAMENTALS.Search_n_Sort.Linear_search_;

public class Linear_search {
    static int search(int[] arr,int key,int k,int l) {
        int index=0;
        boolean flag=false;
        if (arr.length==0){
            return -1;
        }

        for (int i = k; i <= l; i++) {
            if (arr[i] == key) {
                index=i;
                return index;

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={12,65,45,73,23,42,121,34,12};
        int[] arr1={};

        System.out.println("Element found at index:"+search(arr,12,0,8));
    }
}