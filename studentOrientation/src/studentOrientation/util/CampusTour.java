package studentOrientation.util;

public enum CampusTour implements CampusTourI{
foot (new Cost(.1,false), new Duration(120), new CarbonFootprint(.001) , new Effort(800)),
bus (new Cost(2,false), new Duration(45), new CarbonFootprint(.5) , new Effort(10));
	
private final CostI cost;
private final DurationI duration;
private final CarbonFootprintI carbonFootprint;
private final EffortI effort;

CampusTour(CostI costIn, DurationI durationIn, CarbonFootprintI carbonFootprintIn, EffortI effortIn){
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
