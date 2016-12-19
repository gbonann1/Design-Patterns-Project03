CS442 Design Patterns
Fall 2016
PROJECT 2 README FILE

Due Date: Friday, October 28, 2016
Submission Date: Thrusday, October 27, 2016
Author(s): GianLuca Bonanno, Steven Huang
e-mail(s): gbonanno1@binghamton.edu, shuang43@binghamton.edu


PURPOSE:

	Builder Pattern.

PERCENT COMPLETE:

	We believe that we have completed 100% of this project.

PARTS THAT ARE NOT COMPLETE:

	All features as required by this project are complete to our knowledge.

BUGS:

	We haven't come across any bugs when testing our code.

FILES:

	Included with this project are 23 files:
	
	- Driver.java, the file which drives the program and contains the main function
	- StudentOrientation.java, 
	- StudentOrientationInterface.java,
	- StudentOrinetationWorkshop.java,
	- StudentOrientationWorkshopI.java, 
	- BuyBooks.java, enum to represent buying books. It contains a Cost, Duration, CarbonFootprint, and Effort object.
	- BuyBooksI.java, interface for BuyBooks activity
	- CampusTour.java, enum to represent campus tour. It contains a Cost, Duration, CarbonFootprint, and Effort object.
	- CampusTourI.java, interface for CampusTour activity
	- CarbonFootprint.java, class to represent carbon footprint in tons. Main data member is double.
	- CarbonFootprintI.java, interface for CarbonFootprint class
	- Cost.java, class to represent cost. Main data member is double
	- CostI.java, interface for Cost class
	- Duration.java, class to represent time in minutes. Main data member is int.
	- DurationI.java, interface for Duration class
	- Effort.java, class to represent calories burnt. Main data member is int.
	- EffortI.java, interface for Effort class
	- RegisterCourses.java, enum to represent registering for courses. It contains a Cost, Duration, CarbonFootprint, and Effort object.
	- RegisterCoursesI.java, interface for RegisterCourse activity
	- SelectDorm.java, enum to represent selecting a dorm. It contains a Cost, Duration, CarbonFootprint, and Effort object.
	- SelectDormI.java, interface for SelectDorm activity
	- build.xml, the ANT compilation file
	- README, the text file you are presently reading

SAMPLE OUTPUT:

	Cost: $105.92999999999999
	Effort: 26 cal
	Duration: 100 min
	Carbon Footprint: 0.8 tons

TO COMPILE:

	Extract the files from the tar.gz. Navigate to the created folder
	steven_huang_gianluca_bonanno\studentOrientation\src\ and run
	the command "ant all". Afterwards, run the command "ant jar".

TO RUN:

	Navigate to the folder 
	steven_huang_gianluca_bonanno\studentOrientation\src\
	Run ant in the following format:
	"ant run"

DATA STRUCTURES AND ALGORITHMS/COMPLEXITY:
	
	N/A

EXTRA CREDIT:

	N/A

BIBLIOGRAPHY:

	N/A

ACKNOWLEDGEMENT:

	N/A