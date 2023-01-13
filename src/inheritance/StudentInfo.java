package inheritance;

import java.util.Arrays;
import java.util.Scanner;

public class StudentInfo extends BasicDetails {
	private String branch;
	private String sid;
	private String[] coursesEnrolled = new String[5];
	private Scanner scan = new Scanner(System.in);

	StudentInfo(String fname, String lname, String phno, int age) {
		super(fname, lname, age, phno);

	}

	public void setCoursesEnrolled() {
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter the course " + (i + 1) + " : ");
			coursesEnrolled[i] = scan.nextLine();
		}

		scan.close();
	}

	public void setSid() {
		System.out.print("Enter SID: ");
		this.sid = scan.nextLine();
	}

	public void setBranch() {
		System.out.print("Enter branch: ");
		this.branch = scan.nextLine();
	}

	public void showDetails() {
		try {
			System.out.println("Name: " + super.fName + " " + super.lName + " | Age: " + super.age + " | Phone number: "
					+ super.phNo + " | Branch: " + this.branch + " | SID: " + this.sid + " | Courses: "
					+ Arrays.toString(this.coursesEnrolled));
		} catch (Exception e) {
			System.out.println("Please enter details before viewing!");
		}
	}
}
