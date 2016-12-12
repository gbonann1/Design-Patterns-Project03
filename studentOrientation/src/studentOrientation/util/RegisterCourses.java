package studentOrientation.util;

public enum RegisterCourses implements RegisterCoursesI{
	form (new Cost(-.03, true), new Duration(15), new CarbonFootprint(.1) , new Effort(5)),
	online (new Cost(0,false), new Duration(15), new CarbonFootprint(0) , new Effort(5));
		
	private final CostI cost;
	private final DurationI duration;
	private final CarbonFootprintI carbonFootprint;
	private final EffortI effort;

	RegisterCourses(CostI costIn, DurationI durationIn, CarbonFootprintI carbonFootprintIn, EffortI effortIn){
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
