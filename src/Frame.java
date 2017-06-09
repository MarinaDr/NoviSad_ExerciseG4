public class Frame {
	private int firstThrow;
	private int secondThrow;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	public int getFirstThrow() {
		return firstThrow;
	}

	public int getSecondThrow() {
		return secondThrow;
	}

	//returns the score of a single frame
	public int score() throws Exception{
		
		if (firstThrow>11 || firstThrow<0) {
			
			throw new BowlingException("Incorrect score");
		}
		//to be implemented
		return firstThrow+secondThrow;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		//to be implemented
		if (firstThrow==10 && secondThrow==0) {
			
			return true;
		}
		else {

		return false;
		}
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare() throws Exception{
		
		if (firstThrow!=10 && score()==10) {
			
			return true;
		} 
		else {
			
			return false;
		}
	}
}
