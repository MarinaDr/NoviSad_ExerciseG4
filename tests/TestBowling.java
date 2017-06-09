import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

/*	@Test
	public void test() {
		fail("Not yet implemented");
	} */
	
	@Test
	public void initial_test() {
		BowlingGame bwlGame=new BowlingGame();
		
		int score=bwlGame.score();
		assertEquals("Incorrect initial score", 0, score);
		
	}

}
