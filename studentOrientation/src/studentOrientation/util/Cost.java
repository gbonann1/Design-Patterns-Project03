package studentOrientation.util;

public class Cost implements CostI{

	private double value;
	private boolean isPercent;
	
	public Cost(double costIn, boolean percentIn){
		value = costIn;
		isPercent = percentIn;
	}
	
	public double getCost(){
		return value;
	}
	
	public boolean getIsPercent(){
		return isPercent;
	}
}
