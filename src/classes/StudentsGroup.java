package classes;

public class StudentsGroup {

	public static void main(String[] args) {
		Student s1 =new Student();
		Student s2 =new Student();
		Student s3 =new Student("Arun2","20STDA017",7,"R&A");
		s1.name="Arun";
		s1.course="AI&DS";
		s1.semester=6;
		s1.sid="20STDA016";
		
		s2.name="Mani";
		s2.course="CSE";
		s2.semester=2;
		s2.sid="23STDA001";
		
		s1.showDetails();
		s2.showDetails();
		s3.showDetails();

	}

}
