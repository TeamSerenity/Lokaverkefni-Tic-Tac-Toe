package is.ru.hugb;

public class GameInit{

	public static void main(String[] args){
		
		Boolean winnerFound = false;

		int turnCounter = 0;
		//initialize an array of arrays to reprisent the playing grid from parameters 

		//Initialize starting variables
		char playerID = 'X';
		Gameplay gameplay = new Gameplay();
		Board board = new Board();
		//initialize an array of arrays to reprisent the playing grid from parameters
		
		board.display();

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
			if (turnCounter > 8)
			{
				winnerFound = true;
			}
			else 
			{
				turnCounter = turnCounter + 1;
			}
		}
			//player makes a turn
			//update playing grid
			//check for winner
			//set next player
			//Useless line please ignore

		//diplay winner

		//give option to play again
	}
}
