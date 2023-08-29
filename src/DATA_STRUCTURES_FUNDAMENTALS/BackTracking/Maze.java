//There is a robot on an m x n grid. The robot is initially located at the topmost-left corner (i.e., grid[0][0]). The
// robot tries to move to the bottommost-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either DOWN
// or RIGHT at any point in time.

//Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.

package DATA_STRUCTURES_FUNDAMENTALS.BackTracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(uniquePathsPrint("",3,3));
//        uniquePaths("",3,3);
        uniquePathsPrint("",3,3);
//        uniquePathsDiagonal("",3,3);

//        boolean[][] board = {{true,false,false,false},{true,true,false,true},{false,true,true,true}};
//        uniquePathsObstacles(board,"",0,0);
    }

    public static void uniquePaths(String p,int m, int n){
        if(m == 1 && n == 1){
            System.out.println(p);
            return;
        }
        if(m>1)
           uniquePaths(p+'d',m-1, n);
        if(n>1)
             uniquePaths(p+'r',m,n-1);
    }

//--------------------------------------------------------------------------------------------------------------

    public static ArrayList<String> uniquePathsPrint(String p, int m, int n){
        if(m == 1 && n == 1){
            ArrayList<String> al = new ArrayList<>();
            al.add(p);
            return al;
        }
        ArrayList<String> ans = new ArrayList<>();

        if(m>1) { //if m = 1, this means we are at last row and hence cant go more down
            ans.addAll(uniquePathsPrint(p + "d", m - 1, n));
        }

        if(n>1) { //if n = 1, this means we are at last column and hence cant go more right
            ans.addAll(uniquePathsPrint(p + "r", m, n - 1));
        }
        return ans;
    }

//--------------------------------------------------------------------------------------------------------------
        public static void uniquePathsDiagonal(String p,int m, int n){
            if(m == 1 && n == 1){
                System.out.println(p);
                return;
            }
            if(m!=1 && n!=1)
                uniquePathsDiagonal(p+"diagonal ",m-1, n-1);
            if(m>1)
                uniquePathsDiagonal(p+"down ",m-1, n);
            if(n>1)
                uniquePathsDiagonal(p+"right ",m,n-1);
        }

//--------------------------------------------------------------------------------------------------------------

    public static void uniquePathsObstacles(boolean[][] board,String p,int m, int n){
        if(m == board.length-1 && n == board[0].length-1){
            System.out.println(p);
            return;
        }
        if(!board[m][n])
            return;

        if(m != board.length-1 && n != board[0].length-1)
            uniquePathsObstacles(board,p+"diagonal ",m+1, n+1);
        if(m < board.length-1)
            uniquePathsObstacles(board,p+"down ",m+1, n);
        if(n < board[0].length-1)
            uniquePathsObstacles(board,p+"right ",m,n+1);
    }

}
