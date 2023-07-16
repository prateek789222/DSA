package DATA_STRUCTURES_FUNDAMENTALS.Search_n_Sort.Sorting_algos;

import java.util.Arrays;

    public class Insertion_sort {
        public static void main(String[] args) {
            int[] arr={4,2,5,1,3};
            System.out.println(Arrays.toString(insertion_sort(arr)));
        }

        private static int[] insertion_sort(int[] arr) {
            for (int i = 0; i<arr.length-1; i++) {
                for(int j=i+1;j>0;j--){
                    if(arr[j]<arr[j-1]){
                        swap(arr,j,j-1);
                    }else{
                        break;
                    }
                }
            }
            return arr;
        }
        static int[] swap(int[] arr,int x,int y){
            int temp=arr[x];
            arr[x]=arr[y];
            arr[y]=temp;
            return arr;
        }
    }

