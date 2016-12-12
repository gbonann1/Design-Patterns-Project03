package studentOrientation.builder;

public class StudentOrientationWorkshop implements StudentOrientationWorkshopInterface{

	public void construct(StudentOrientationInterface soIn){
		soIn.buildBooks();
		soIn.buildCourses();
		soIn.buildDorm();
		soIn.buildTour();
	}
}
