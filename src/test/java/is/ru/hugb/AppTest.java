/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package is.ru.hugb;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        GameInit classUnderTest = new GameInit();
        //assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
        @Test public void testActionIsLegal() {
        Gameplay classUnderTest = new Gameplay();
        char playerid = 'X';
		char bord[][] = {{'0','0','0'},{'0','0','0'},{'0','0','0'}};
		int a = 1;
		int b = 1;
        assertTrue("Action should be legal", classUnderTest.islegal(bord, playerid, a, b));
    }
}
