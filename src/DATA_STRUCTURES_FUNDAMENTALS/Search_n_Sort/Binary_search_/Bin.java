package DATA_STRUCTURES_FUNDAMENTALS.Search_n_Sort.Binary_search_;

public class Bin {
    public static void main(String[] args) {
    int[] arr={2,3,4,5,6,7,8,9}; //sorted array
        System.out.println(binarySearch(arr,9));
    }
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2; //better way of finding of mid value. As (S+E)/2 may exceed range of integer
            //hence s+(e-s)/2 which is mathematically same as (s+e)/2

            if (target==arr[mid]){
                return mid;
            }

            else if (target<arr[mid]){
                end=mid-1;
            }

            else if (target>arr[mid]) {
                start=mid+1;
            }
        }
        return -1;
    }
}