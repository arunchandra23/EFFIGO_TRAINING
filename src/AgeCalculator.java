// Java program for the above approach

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class AgeCalculator {

	
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		 SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
		 Date date = new Date();  
		
		System.out.println("Enter DOB in the format(dd-mm-yyyy): ");
	
		String start_date
			= 	scan.nextLine();
		 String end_date=formatter.format(date);
		 GetAge age =new GetAge(start_date, end_date);
		 age.showAge();
		 scan.close();
		 return;
	}
}
