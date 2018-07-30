package movies;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieGenre {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Please enter a movie genre: (Scary, Action, Comedy, Scifi, or Animation");
             
        
        Movie m = new Movie(scan.nextLine());
        System.out.println(m.getName() + " Are in the " + m.getcategory() + " Category");

        
        ArrayList<String> title = new ArrayList<>();
        title.add("Star Wars");
        title.add("Toy Story");
        title.add("Dumb and Dumber");
        title.add("War of the Worlds");
        title.add("Die Hard");
        title.add("Happy Gilmore");
        title.add("Lord of the Rings");
        title.add("The Lion King");
        title.add("Transformers");
        title.add("Evil Dead");
	}

}
