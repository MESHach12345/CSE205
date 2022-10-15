public class CheckUpperLeftToLowerRight {
    public static boolean checkUpperLeftToLowerRight(String[][] board)
    {
        boolean check = false;

        if (board[0][0] == board[1][1]) {
            if (board[1][1] == board[2][2]) {
                check = true;
            }
        }

        return check;
    }
}
