package encryption;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Decrypt d = new Decrypt();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the encrypted String: ");

		String k = d.decryptText(scan.nextLine(), "XkhZG4fW2t2W");
		System.out.println("The decrypted String: " + k);
		scan.close();

	}

}
