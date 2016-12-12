package studentOrientation.util;

public class Duration implements DurationI{

	private int minutes;
	
	public Duration(int minutesIn){
		minutes = minutesIn;
		
	}
	
	public int getDuration(){
		return minutes;
	}
}
