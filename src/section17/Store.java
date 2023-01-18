package section17;

public class Store {
	Movie[] movies;

	Store() {
		this.movies = new Movie[10];
	}

	public Movie getMovie(int index) {

		return new Movie(movies[index]);
	}

	public void setMovie(int index, Movie movie) {
		this.movies[index] = new Movie(movie);
	}

	public void printStore() {
		System.out.println("********************************MOVIE STORE*******************************");
		for (int i = 0; i < movies.length; i++) {
			if (movies[i] != null) {
				System.out.println(movies[i]);
			}
		}
	};
}
