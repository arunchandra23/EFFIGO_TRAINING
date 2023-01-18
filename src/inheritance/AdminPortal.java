package inheritance;

import java.util.Scanner;

public class AdminPortal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String fname, lname, ph;
		int age;
		System.out.println("Enter First Name: ");
		fname = scan.nextLine();
		System.out.println("Enter Last Name: ");
		lname = scan.nextLine();
		System.out.println("Enter Phone Number: ");
		ph = scan.nextLine();
		System.out.println("Enter Age: ");
		age = scan.nextInt();

		StudentInfo s1 = new StudentInfo(fname, lname, ph, age);
		s1.setSid();
		s1.setBranch();
		s1.setCoursesEnrolled();
		s1.showDetails();
		scan.close();

	}

}
