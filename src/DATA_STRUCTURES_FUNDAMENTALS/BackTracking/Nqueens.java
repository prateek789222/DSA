package DATA_STRUCTURES_FUNDAMENTALS.BackTracking;

public class Nqueens {
    public static void main(String[] args) {
        int n = 5;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board,0) + " ways");
    }

    static int queens(boolean[][] board, int row) {

        //base condition
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        //placing the queen and checking for every col
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col]=true;
                count += queens(board,row+1);
                board[row][col]=false; //backtracking
            }
        }
        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col){
        //vertical
        for (int i = 0; i < board.length; i++) {
            if(board[i][col])
                return false;
        }
        
        //horizontal
        for (int j = 0; j < board[0].length; j++) {
            if(board[row][j])
                return false;
        }
        
        //upper left
        int i = row;
        int j = col;
        while(i>=0 && j>=0){
            if(board[i][j])
                return false;
            i--; j--;
        }

        //upper right
        int k = row;
        int l = col;
        while(k>=0 && l<board.length){
            if(board[k][l])
                return false;
            k--; l++;
        }
        return true;
    }

    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q");
                }
                else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}