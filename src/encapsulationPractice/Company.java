package encapsulationPractice;

public class Company {

	public static void main(String[] args) {
		Person emp1 = new SalariedEmployee(20000);
		emp1.setName("Arun");
		emp1.setEmpId("#EMP1");
		emp1.getDetails();
	}

}
