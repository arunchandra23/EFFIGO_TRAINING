package streamApiAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStudent {

	public static void main(String[] args) {
		List<Student> students =new ArrayList<Student>();
		students.add(new Student(1, "Arun", 18));
		students.add(new Student(2, "Aparna", 50));
		students.add(new Student(3, "Sri", 20));
		students.add(new Student(4, "Rushi", 19));
		students.add(new Student(5, "Guna", 18));
		students.add(new Student(6, "Vaigarai", 21));
		students.add(new Student(7, "Arun", 20));

		System.out.println("Distinct names of students: "+
		students.stream().map((student)->{return student.getName();}).collect(Collectors.toSet())
		);
		System.out.println("Students whose age is greater than 18: "+
		students.stream().filter((student)->student.getAge()>18).collect(Collectors.toList())
		);
		
		Stream<Student> stream=students.stream();
		
		long avgAge=stream.map(s->s.getAge()).reduce(0,(x,y)->x+ y)/students.stream().count();
		
		System.out.println("Average age of students: "+avgAge);
		
		
	}

}
