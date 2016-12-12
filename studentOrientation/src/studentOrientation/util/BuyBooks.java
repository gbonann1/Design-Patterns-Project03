package studentOrientation.util;

public enum BuyBooks implements BuyBooksI{
	uni (new Cost(105, false), new Duration(30), new CarbonFootprint(.2) , new Effort(10)),
	mando (new Cost(100,false), new Duration(15), new CarbonFootprint(.2) , new Effort(5));
		
	private final CostI cost;
	private final DurationI duration;
	private final CarbonFootprintI carbonFootprint;
	private final EffortI effort;

	BuyBooks(CostI costIn, DurationI durationIn, CarbonFootprintI carbonFootprintIn, EffortI effortIn){
		cost = costIn;
		duration = durationIn;
		carbonFootprint = carbonFootprintIn;
		effort = effortIn;
	}

	public CostI getCost() {
		return cost;
	}

	public DurationI getDuration() {
		return duration;
	}

	public CarbonFootprintI getCarbonFootprint() {
		return carbonFootprint;
	}

	public EffortI getEffort() {
		return effort;
	}
	
	
}
