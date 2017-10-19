/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package is.ru.hugb;

import java.io.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest
{
    @Test public void testBoard()
    {
        Board board = new Board();
        assertNotNull(board.getBoard());
    }

    @Test public void testBoardDisplay()
    {
        Board board = new Board();

        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);

        board.display();

        assertEquals("|   |   |   |\n-------------\n|   |   |   |\n-------------\n|   |   |   |" + System.getProperty("line.separator") , os.toString());

        PrintStream originalOut = System.out;
        System.setOut(originalOut);
    }
	    
	@Test public void testBoardMove()
    {
        Board board = new Board();
        
		Board.placeMove(2,1,'X');
		
		board.display()
		
		assertEquals("|   |   |   |\n-------------\n|   |   |   |\n-------------\n|   | X |   |" + System.getProperty("line.separator") , os.toString());
		
		
    }
		@Test public void testBoardMove()
    {
        Board board = new Board();
        
		Board.placeMove(2,2,'O');
		
		board.display()
		
		assertEquals("|   |   |   |\n-------------\n|   |   |   |\n-------------\n|   |  O|   |" + System.getProperty("line.separator") , os.toString());
		
		
    }
		@Test public void testBoardMove()
    {
        Board board = new Board();
        
		Board.placeMove(1,1,'X');
		
		board.display()
		
		assertEquals("|   |   |   |\n-------------\n|   | X |   |\n-------------\n|   | X |   |" + System.getProperty("line.separator") , os.toString());
		
		
    }
		@Test public void testBoardMove()
    {
        Board board = new Board();
        
		Board.placeMove(0,0,'X');
		
		board.display()
		
		assertEquals("|X  |   |   |\n-------------\n|   |   |   |\n-------------\n|   | X |   |" + System.getProperty("line.separator") , os.toString());
		
		
    }
}
