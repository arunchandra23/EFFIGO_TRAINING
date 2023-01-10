package abstractionPractice;

public class IsEvenNumber {
	int number;
	
	IsEvenNumber(int num){
		this.number=num;
	}
	String check() {
		if(this.number%2==0) {
			return "even";
		}
		return "odd";
	}
	void showIsEven() {
		System.out.println("The number "+number+" is "+check());
	}

}
