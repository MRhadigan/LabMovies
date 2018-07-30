package movies;

import java.util.Scanner;

public class MovieGenre {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Please enter a movie genre: (Scary, Action, Comedy, Scifi, or Animation");
             
        
        Movie m = new Movie(scan.nextLine());
        System.out.println(m.getName() + " Are in the " + m.getcategory() + " Category");

	}

}
