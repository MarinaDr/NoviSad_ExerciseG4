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
	
	@Test
	public void spare_test() {
		
		Frame frame=new Frame(5, 5);
		
		boolean isSpare=frame.isSpare();
		assertEquals("Incorrect score when spare", true, isSpare);
	}
	
	@Test
	public void strike_test() {
		
		Frame frame=new Frame(10, 0);
		
		boolean isStrike=frame.isStrike();
		assertEquals("Incorrect score when strike", true, isStrike);
	}

}
