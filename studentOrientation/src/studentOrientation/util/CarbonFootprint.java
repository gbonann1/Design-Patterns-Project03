package studentOrientation.util;

public class CarbonFootprint implements CarbonFootprintI{

	private double tons;
	
	public CarbonFootprint(double tonsIn){
		tons = tonsIn;
	}
	
	public double getCarbonFootprint(){
		return tons;
	}
}
