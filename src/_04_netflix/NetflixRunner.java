package _04_netflix;

public class NetflixRunner {

	public static void main(String[] args) {
		Movie topgun1 = new Movie("Topgun", 5);
		Movie topgun2 = new Movie("Topgun Maverick", 5);
		Movie titans = new Movie("Remember the Titans", 5);
		Movie minions = new Movie("Minions The Rise of Gru", 5);
		Movie percyJackson = new Movie("Percy Jackson & The Lightning Thief", 2);
		Movie twilight = new Movie("Twilight", 1);
		System.out.println(twilight.getTicketPrice());
		NetflixQueue queue = new NetflixQueue();
		queue.addMovie(topgun1);
		queue.addMovie(topgun2);
		queue.addMovie(titans);
		queue.addMovie(minions);
		queue.addMovie(percyJackson);
		queue.addMovie(twilight);
		queue.printMovies();
		queue.sortMoviesByRating();
		System.out.println(queue.getBestMovie());
		System.out.println(queue.getMovie(1));

	}
	
}
