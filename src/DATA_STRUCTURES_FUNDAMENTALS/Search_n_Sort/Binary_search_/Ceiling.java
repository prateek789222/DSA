package DATA_STRUCTURES_FUNDAMENTALS.Search_n_Sort.Binary_search_;

import java.util.Scanner;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.println("Enter target: ");
        Scanner sc=new Scanner(System.in);
        int target= sc.nextInt();
        System.out.println("ceiling: "+ceiling_(arr, target));
        System.out.println("floor: "+floor(arr, target));

    }

    static int ceiling_(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (target == arr[mid])
                return arr[mid];

            else if (target > arr[mid]) {
                s = mid + 1;

            } else if (target < arr[mid]) {
                e = mid - 1;
            }
        }
            return arr[s];

        }

    static int floor(int[] arr, int target){
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (target == arr[mid])
                return arr[mid];

            else if (target > arr[mid]) {
                s = mid + 1;

            } else if (target < arr[mid]) {
                e = mid - 1;
            }
        }
        return arr[e];
    }

}

