package is.ru.hugb;

public class GameInit{

	public static void main(String[] args){
		char playerid = 'X';
		char bord[][] = {{'0','0','0'},{'0','0','0'},{'0','0','0'}};
		System.out.println("it's player " + playerid + "'s turn!");
		Gameplay gameplay = new Gameplay();
		gameplay.action(bord, playerid);

		//initialize an array of arrays to reprisent the playing grid from parameters 

		//Repeat until winner is found
			//player makes a turn 
			//update playing grid
			//check for winner
			//set next player
			//Useless line please ignore

		//diplay winner

		//give option to play again
	}
}