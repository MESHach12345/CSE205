// Challenge 6.13.4

public class TicTacToe {
    public static boolean checkCol(String[][] board, int col)
    {
        boolean check = false;

        if (board[0][col] == board[1][col]) {
            if (board[0][col] == board[2][col]) {
                check =  true;
            }
        }

        return check;
    }
}