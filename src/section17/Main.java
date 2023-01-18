package section17;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Movie[] movies = new Movie[] { new Movie("The Shawshank Redemption", "BlueRay", 9.2),
				new Movie("The Godfather", "BlueRay", 9.1), new Movie("The Godfather: Part II", "DVD", 9.0),
				new Movie("The Dark Knight", "BlueRay", 9.0), new Movie("Schindler's List", "DVD", 8.9),
				new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
				new Movie("Pulp Fiction", "DVD", 8.8),
				new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8) };
		Store store = new Store();

		String key = "continue";
		while (key.equals("continue")) {
			for (int i = 0; i < movies.length; i++) {
				store.setMovie(i, movies[i]);
			}
			store.printStore();
			System.out.print("\nPlease choose an integer between 0 - 9: ");
			int index = scan.nextInt();

			Movie movie = store.getMovie(index);
			System.out.print("Set a new rating for " + movie.getName() + ": ");
			double rating = scan.nextDouble();
			movie.setRating(rating);
			store.setMovie(index, movie);

			store.printStore();
			System.out.print("To edit another rating, type: 'continue': ");
			key = scan.next();
		}
		scan.close();

	}

}
