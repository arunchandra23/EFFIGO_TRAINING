package encapsulationPractice;

public class SalariedEmployee extends Person {
	int salary;

	SalariedEmployee(int s) {
		this.salary = s;
	}

	public void getDetails() {
		System.out.println(
				"Name: " + super.getName() + " | Employee Id: " + super.getEmpId() + " | Salary: " + this.salary);
	}
}
