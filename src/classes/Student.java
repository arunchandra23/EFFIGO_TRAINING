package classes;

public class Student {
	String name;
	String sid;
	int semester;
	String course;
	Student(){}
	Student(String name,String sid,int semester,String course){
		this.name=name;
		this.sid=sid;
		this.semester=semester;
		this.course=course;
	}
	
	void showDetails() {
		System.out.println("Name: "+this.name+" | SID: "+this.sid+" | Semester: "+this.semester+" | Course: "+this.course);
	}
	
}
