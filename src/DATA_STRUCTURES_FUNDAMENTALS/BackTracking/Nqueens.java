package DATA_STRUCTURES_FUNDAMENTALS.BackTracking;

public class Nqueens {
    public static void main(String[] args) {

    }
    public static int queens(boolean[][] board, int row){
        if(row==board.length){
//            display(board);
            return 1;
        }
        int count = 0;
        //placing queen and checking for every row and col
        for (int col = 0; col < board.length; col++) {
            //place if the queen if its safe
//            if(isSafe(board,row,col))
                board[row][col] = true;
        }

        return count;
    }
}
