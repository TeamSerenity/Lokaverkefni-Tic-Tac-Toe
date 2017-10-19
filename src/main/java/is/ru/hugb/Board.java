package is.ru.hugb;

public class Board
{
    public static final int BOARD_SIZE = 3;

    private char[][] board;

    public Board()
    {
        board = new char[BOARD_SIZE][BOARD_SIZE];
        for(int row = 0; row < BOARD_SIZE; row++)
        {
            for(int col = 0; col < BOARD_SIZE; col++)
            {
                board[row][col] = ' ';
            }
        }
    }

    public char[][] getBoard()
    {
        return board;
    }

    public void placeMove(int row, int col, char player)
    {
        board[row][col] = player;
    }

    public void display()
    {
        System.out.println("| " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " |");
        System.out.println("-------------");
        System.out.println("| " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " |");
        System.out.println("-------------");
        System.out.println("| " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " |");
    }
}
