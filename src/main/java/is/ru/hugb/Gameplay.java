package is.ru.hugb;

import java.util.Scanner;


public class Gameplay
{
   public Board action(Board board, char playerid)
   {
   	   Boolean legal = true;
       while (legal)
       {
           int a = cin("row");
           int b = cin("collum");
           a = a-1;
           b = b-1;
           legal = islegal(board,playerid, a, b);
       }
        return board;
   }

   private Boolean islegal(Board board, char playerid, int a, int b)
   {
   	char bord[][] = board.getBoard();
       if ((-1 < a && a <3)&&(-1 < b && b <3))
       {
           if (bord[a][b] != ' ')
           {
               System.out.println("This area is already taken");
               return true;
           }
           else
           {
               board.placeMove(a, b, playerid);
               return false;
           }
       }
       else
       {
           System.out.println("This is an illegal action");
           return true;
       }
   }
   private int cin(String message)
   {
       System.out.println("Please enter the "+ message + " where you want to place your mark 1 - 3");
       Scanner scan = new Scanner( System.in );
       int foo = -1;
       if(scan.hasNext())
       {
       	    String input = scan.nextLine();
       		try
       		{
       			foo = Integer.parseInt(input);
       			return foo;
       		}
       		catch(NumberFormatException e)
       		{
       			return foo;
       		}
       }
       return 1;
   }
}




