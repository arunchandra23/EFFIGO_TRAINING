package encapsulationPractice;

public class Person {
	private String name;
	private String empId;
	
	void setName(String n) {
		this.name=n;
	}
	void setEmpId(String id) {
		this.empId=id;
	}
	String getName() {
		return this.name;
	}
	String getEmpId() {
		return this.empId;
	}
	
	void getDetails() {
		System.out.println("Please use the object to instantiate details");
	}
	
	
}
