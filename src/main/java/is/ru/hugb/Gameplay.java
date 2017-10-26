package is.ru.hugb;

import java.util.Scanner;


public class Gameplay
{
   public char[][] action(char bord[][], char playerid)
   {
   	   Boolean legal = true;
       while (legal)
       {
           int a = cin("row");
           int b = cin("collum");
           legal = islegal(bord,playerid, a, b);
       }
        return bord;
   }

   private Boolean islegal(char[][] bord, char playerid, int a, int b)
   {
       if ((0 < a && a <4)&&(0 < b && b <4))
       {
           if (bord[a-1][b-1] != '0')
           {
               System.out.println("This area is already taken");
               return true;
           }
           else
           {
               bord[a-1][b-1] = playerid;
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
       if(scan.hasNext())
       {
       		String input = scan.nextLine();
       		return Integer.parseInt(input);
       	}
       return 1;
   }
}




