package studentOrientation.builder;

import studentOrientation.util.BuyBooks;
import studentOrientation.util.CampusTour;
import studentOrientation.util.CarbonFootprint;
import studentOrientation.util.Cost;
import studentOrientation.util.Duration;
import studentOrientation.util.Effort;
import studentOrientation.util.RegisterCourses;
import studentOrientation.util.SelectDorm;

public class StudentOrientation implements StudentOrientationInterface{
	BuyBooks bb;
	CampusTour ct;
	RegisterCourses rc;
	SelectDorm sd;
	double runningMulti = 1.0;

	Cost totalCost=new Cost(0,false);
	Effort totalEffort=new Effort(0);
	Duration totalDuration=new Duration(0);
	CarbonFootprint totalCarbonFootprint=new CarbonFootprint(0);


	public StudentOrientation(BuyBooks buyBooksIn, CampusTour campusTourIn, RegisterCourses registerCoursesIn, SelectDorm selectDormIn) {
		bb=buyBooksIn;
		ct=campusTourIn;
		rc=registerCoursesIn;
		sd=selectDormIn;
	}

	public void buildBooks() {
		double newCost=totalCost.getCost()+bb.getCost().getCost();
		totalCost=new Cost(newCost,false);
		int newEffort=totalEffort.getEffort()+bb.getEffort().getEffort();
		totalEffort=new Effort(newEffort);
		int newDuration=totalDuration.getDuration()+bb.getDuration().getDuration();
		totalDuration=new Duration(newDuration);
		double newCarbonFootprint=totalCarbonFootprint.getCarbonFootprint()+bb.getCarbonFootprint().getCarbonFootprint();
		totalCarbonFootprint=new CarbonFootprint(newCarbonFootprint);
	}

	public void buildTour() {
		double newCost=totalCost.getCost()+ct.getCost().getCost();
		totalCost=new Cost(newCost,false);
		int newEffort=totalEffort.getEffort()+ct.getEffort().getEffort();
		totalEffort=new Effort(newEffort);
		int newDuration=totalDuration.getDuration()+ct.getDuration().getDuration();
		totalDuration=new Duration(newDuration);
		double newCarbonFootprint=totalCarbonFootprint.getCarbonFootprint()+ct.getCarbonFootprint().getCarbonFootprint();
		totalCarbonFootprint=new CarbonFootprint(newCarbonFootprint);
	}

	public void buildCourses() {
		if (rc.getCost().getIsPercent()){
			runningMulti += rc.getCost().getCost();
		}else{
			double newCost=totalCost.getCost()+rc.getCost().getCost();
			totalCost=new Cost(newCost,false);
		}
		int newEffort=totalEffort.getEffort()+rc.getEffort().getEffort();
		totalEffort=new Effort(newEffort);
		int newDuration=totalDuration.getDuration()+rc.getDuration().getDuration();
		totalDuration=new Duration(newDuration);
		double newCarbonFootprint=totalCarbonFootprint.getCarbonFootprint()+rc.getCarbonFootprint().getCarbonFootprint();
		totalCarbonFootprint=new CarbonFootprint(newCarbonFootprint);
	}

	public void buildDorm() {
		if (rc.getCost().getIsPercent()){
			runningMulti += sd.getCost().getCost();
		}else{
			double newCost=totalCost.getCost()+sd.getCost().getCost();
			totalCost=new Cost(newCost,false);
		}
		int newEffort=totalEffort.getEffort()+sd.getEffort().getEffort();
		totalEffort=new Effort(newEffort);
		int newDuration=totalDuration.getDuration()+sd.getDuration().getDuration();
		totalDuration=new Duration(newDuration);
		double newCarbonFootprint=totalCarbonFootprint.getCarbonFootprint()+sd.getCarbonFootprint().getCarbonFootprint();
		totalCarbonFootprint=new CarbonFootprint(newCarbonFootprint);

	}

	@Override
	public String toString(){
		return "Cost: $"+totalCost.getCost()*runningMulti+"\nEffort: "+totalEffort.getEffort()+" cal\nDuration: "+totalDuration.getDuration()+" min\nCarbon Footprint: "+totalCarbonFootprint.getCarbonFootprint()+" tons";
	}

}
