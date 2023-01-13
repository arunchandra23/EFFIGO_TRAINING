package inheritance;

public class AdminPortal {

	public static void main(String[] args) {

		StudentInfo s1 = new StudentInfo("Arunchandra", "Boini", "9000170044", 19);
		s1.setSid();
		s1.setBranch();
		s1.setCoursesEnrolled();
		s1.showDetails();

	}

}
