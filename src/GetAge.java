import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetAge {
	private String start_date;
	private String end_date;
	private long difference_In_Time;
	private long difference_In_Years;
	private long difference_In_Days;
	
	GetAge(String start,String end){
		this.start_date=start;
		this.end_date=end;
	}
	
	private void getDifferences(){
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");


		try {

			Date d1 = sdf.parse(start_date);
			Date d2 = sdf.parse(end_date);

			difference_In_Time
				= d2.getTime() - d1.getTime();

			difference_In_Years= (difference_In_Time/ (1000l * 60 * 60 * 24 * 365));

			difference_In_Days= ((difference_In_Time/ (1000 * 60 * 60 * 24))% 365);
		}

		catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
	
		void showAge() {
			getDifferences();
			System.out.print(
					"Difference "
					+ "between two dates is: ");

				System.out.println(
					difference_In_Years
					+ " years, "
					+ difference_In_Days
					+ " days"
				);
		}
	

}
