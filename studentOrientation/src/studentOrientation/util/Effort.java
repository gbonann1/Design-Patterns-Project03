package studentOrientation.util;

public class Effort implements EffortI{

	private int calories;
	
	public Effort(int caloriesIn){
		calories = caloriesIn;
	}
	
	public int getEffort(){
		return calories;
	}
}
