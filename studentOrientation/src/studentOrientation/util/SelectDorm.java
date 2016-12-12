package studentOrientation.util;

public enum SelectDorm implements SelectDormI{
	stand (new Cost(0,false), new Duration(60), new CarbonFootprint(.0005) , new Effort(20)),
	game (new Cost(.02,true), new Duration(10), new CarbonFootprint(0) , new Effort(1)); 
		
	private final CostI cost;
	private final DurationI duration;
	private final CarbonFootprintI carbonFootprint;
	private final EffortI effort;

	SelectDorm(CostI costIn, DurationI durationIn, CarbonFootprintI carbonFootprintIn, EffortI effortIn){
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
