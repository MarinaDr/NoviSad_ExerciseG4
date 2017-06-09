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
	
	@Test 
	public void score_4_and_5() {
		
		Frame frame=new Frame(4, 5);
		
		int score=frame.score();
		assertEquals("Incorrect score", 9, score);
		
	}

}
