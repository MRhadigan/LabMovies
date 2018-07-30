package movies;

public class Movie {
	private String title;
    private String category;
    
    
    
    
    public Movie() {
        // assign parameters from constructor to instance variables.
        
            title = "-1";
            category = "-1";
        
    }

    public Movie (String category) {
        if(category.equalsIgnoreCase("scary")) {
        	this.title = "Evil Dead, " + "Chucky, ";
        	this.category = "Scary";
        }
        else if (category.equalsIgnoreCase("comedy")) {
        	this.title = "Happy Gilmore, " + "Dumb and Dumber, ";
        	this.category = "Comedy";
        }
        else if (category.equalsIgnoreCase("scifi")) {
        	this.title = "Star Wars, " + "War of the Worlds, ";
        	this.category = "Scifi";
        }
        else if (category.equalsIgnoreCase("Action")) {
        	this.title = "Die Hard, " + "Lord of the Rings, ";
        	this.category = "Action";
        }
        else if (category.equalsIgnoreCase("animation")) {
        	this.title = "Toy Story, " + "The Lion King, ";
        	this.category = "Animation";
        }
        else {
        	System.out.println("Please enter a valid Genre!");
        }
        
    }
    
    public String getName() {
        return title;
    }
    


    public String getcategory() {
        return category;
    }
    
	
    
@Override
    public String toString() {
        return " " + title + " Movie Genre " + category;
    }

}
