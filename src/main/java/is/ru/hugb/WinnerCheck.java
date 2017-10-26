package is.ru.hugb;

public class WinnerCheck
{
	private Board board;
	
	public WinnerCheck(Board b)
	{
		this.board = b;
	}

	public boolean isWinner(char player)
	{

		if((board.getBoard()[0][0] == player && board.getBoard()[0][1] == player && board.getBoard()[0][2] == player) || //horizontal
		(board.getBoard()[1][0] == player && board.getBoard()[1][1] == player && board.getBoard()[1][2] == player) || 
		(board.getBoard()[2][0] == player && board.getBoard()[2][1] == player && board.getBoard()[2][2] == player) || 

		(board.getBoard()[0][0] == player && board.getBoard()[1][0] == player && board.getBoard()[2][0] == player) || //vertical
		(board.getBoard()[0][1] == player && board.getBoard()[1][1] == player && board.getBoard()[2][1] == player) || 
		(board.getBoard()[0][2] == player && board.getBoard()[1][2] == player && board.getBoard()[2][2] == player) ||
 
		(board.getBoard()[0][0] == player && board.getBoard()[1][1] == player && board.getBoard()[2][2] == player) || //diagonal
		(board.getBoard()[0][2] == player && board.getBoard()[1][1] == player && board.getBoard()[2][0] == player))
			return true;
		else
			return false;
	}
}
