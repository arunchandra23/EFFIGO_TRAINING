package encapsulationPractice;

public class SalariedEmployee extends Person {
	private int salary;
	
	SalariedEmployee(int s){
		this.salary=s;
	}
	
	void getDetails() {
		System.out.println("Name: "+super.getName()+" | Employee Id: "+super.getEmpId()+" | Salary: "+this.salary);
	}
}
