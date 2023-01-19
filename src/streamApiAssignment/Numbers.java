package streamApiAssignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Numbers {

	public static long getCount(String inp,char c) {
		
		return inp.chars().filter((sh)->sh==c).count();
	}
	public static void main(String[] args) {
		
		Map<Character,Long> counts=new HashMap<Character,Long>();
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a string: ");

		String inp=scan.next();
		
		for (int i = 0; i < inp.length(); i++) {
			counts.put(inp.charAt(i), getCount(inp,inp.charAt(i)));
		}
		
		System.out.println(counts.toString());
		
			
		scan.close();
	}

}
