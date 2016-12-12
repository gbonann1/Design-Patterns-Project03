package studentOrientation.driver;

import studentOrientation.builder.StudentOrientation;
import studentOrientation.builder.StudentOrientationInterface;
import studentOrientation.builder.StudentOrientationWorkshop;
import studentOrientation.builder.StudentOrientationWorkshopInterface;
import studentOrientation.util.BuyBooks;
import studentOrientation.util.CampusTour;
import studentOrientation.util.RegisterCourses;
import studentOrientation.util.SelectDorm;

public class Driver {

	public static void main(String[] args) {
		
		StudentOrientationInterface so = new StudentOrientation(BuyBooks.uni, CampusTour.bus, RegisterCourses.form, SelectDorm.game);
		StudentOrientationWorkshopInterface shop = new StudentOrientationWorkshop();
		shop.construct(so);
		System.out.println(so);
	}

}
