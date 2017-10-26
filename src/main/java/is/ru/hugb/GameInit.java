package is.ru.hugb;

import java.util.Scanner;

public class GameInit{

	public static void main(String[] args)
	{
		boolean play = true;
		while(play)
		{
			int turnCounter = 0;
			//initialize an array of arrays to reprisent the playing grid from parameters 

			//Initialize starting variables
			char playerID = 'O';
			Boolean winnerFound = false;
			Gameplay gameplay = new Gameplay();
			Board board = new Board();
			WinnerCheck winnerc = new WinnerCheck(board);
		
			//Start GameLoop
			while(!winnerFound)
			{
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
				winnerFound = winnerc.isWinner(playerID);
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
			board.display();
			boolean valid = false;
			Scanner scan = new Scanner( System.in );
			while(!valid)
			{
				System.out.println("Do you want to play again?(Y/N)");
				char input = 's';
				char y = 'Y';
				char n = 'N';
				String s;
				if(scan.hasNext())
				{
					s = scan.nextLine();
					input = s.charAt(0);
				}
				if(input == y)
				{
					valid = true;
					play = true;
				}
				else if (input == n)
				{
					valid = true;
					play = false;
				}
				else
				{
					valid = false;
				}
			}
		}
	}
}
