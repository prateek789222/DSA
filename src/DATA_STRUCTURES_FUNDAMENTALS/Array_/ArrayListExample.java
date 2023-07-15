package DATA_STRUCTURES_FUNDAMENTALS.Array_;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        for (int i=0;i<3;i++){ //to create individual arraylists in the main array list
            list.add(new ArrayList<>());
        }

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println("----");
        System.out.println(list);
        System.out.println("----");
        for (ArrayList<Integer> i:list
             ) {
            System.out.println(i);

        }

    }
}
