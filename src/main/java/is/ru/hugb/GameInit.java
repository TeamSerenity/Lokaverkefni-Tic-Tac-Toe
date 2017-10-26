package is.ru.hugb;

public class GameInit{

	public static void main(String[] args){
		int turnCounter = 0;
		//initialize an array of arrays to reprisent the playing grid from parameters 

		//Initialize starting variables
		char playerID = 'O';
		Boolean winnerFound = false;
		Gameplay gameplay = new Gameplay();
		Board board = new Board();
		
		//Start GameLoop
		while(!winnerFound){

			if(playerID == 'O')
			{
				playerID = 'X';
			}
			else
			{
				playerID = 'O';
			}

			System.out.println("it's player " + playerID + "'s turn!");
			board.display();
			board = gameplay.action(board, playerID);
			//Check for winner

			//turncounter for testing
			if (turnCounter > 7)
			{
				winnerFound = true;
			}
			else 
			{
				turnCounter = turnCounter + 1;
			}
		}

		//diplay winner

		//give option to play again
	}
}
