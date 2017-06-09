import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time:
// Student ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	private int score;
	private int frameCounter=0;
	
	
	public BowlingGame(){
		
		score=0;
	}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		
		frames.add(frame);
		if (frame.isSpare()) {
			
			setBonus(frame.getFirstThrow(), frame.getSecondThrow());
		}
		score=score+frame.score();
		frameCounter++;
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		
		if (firstThrow!=10 && firstThrow+secondThrow==10) {
			score=score+frames.get(frameCounter+1).getFirstThrow();
		}
	}
	
	// Returns the game score
	public int score(){
		//to be implemented: should return game score 
		for (int i=0; i<frameCounter; i++) {
			setBonus(frames.get(i).getFirstThrow(), frames.get(i).getSecondThrow());
		}
		return score;
	}
}
