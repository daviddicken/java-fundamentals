package inheritance;

import java.util.ArrayList;

public class Theater extends Shop{

    private String name;
    private ArrayList<String> movies;
    public ArrayList<Reviews> reviewList = new ArrayList<>();

    public Theater(String name, String price, String desc, ArrayList<String> movies){
        super(name,price,desc);
        this.name = name;
        this.movies = movies;
    }

    //============== Methods ================
    public void addMovie(String aMovie){
        movies.add(aMovie);
    }

    public void removeMovie(String aMovie){
        if(movies.contains(aMovie)){
            movies.remove(aMovie);
        }
    }

    public String toString(){
        String returnString = String.format("**** %s ****\nMovie List:", name);
        for(String movie : movies){
            returnString += "\n" + movie;
        }
        return returnString;
    }

    public void addReview(String review, String author, int stars)
    {
        Reviews newReview = new Reviews(review, author, stars); // create new review
        newReview.aTheater = this;                                // add restaurant to review
        this.reviewList.add(newReview);                        // add review to restaurant
    }

    //========== Getters & Setters ===============
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public ArrayList<String> getMovies() { return movies; }
    public void setMovies(ArrayList<String> movies) {
        this.movies = movies;
    }
}
