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
	private int frameCounter=-1;
	
	
	public BowlingGame(){
		
		score=0;
	}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
			
		frames.add(frame);
		score=score+frame.score();
		frameCounter++;
			
		if (frameCounter>=1) {
			
			if (frames.get(frameCounter-1).isSpare()) {
				
				setBonus(frame.getFirstThrow(), 0);
			}
		}
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		
			score=score+firstThrow+secondThrow;

	}
	
	// Returns the game score
	public int score(){
		//to be implemented: should return game score 
		return score;
	}
}
