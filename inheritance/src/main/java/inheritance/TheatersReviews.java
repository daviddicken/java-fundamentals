package inheritance;

public class TheatersReviews extends Reviews{

    String movieWatched;

    public TheatersReviews(String review, String author, int stars, String movieWatched) {
        super(review, author, stars);
        this.movieWatched = movieWatched;
    }

//    public String toString(){
//        return String.format("Reviewer: %s Movie Watched: %s\n%s\n",getAuthor(),movieWatched,getReview());
//    }

    public String toString(){
        String returnString = String.format("**** %s ****\nMovie List:", aTheater.getName());
        for(String movie : aTheater.getMovies()){
            returnString += "\n" + movie;
        }
        returnString += String.format("\nReviewer: %s  Stars: %d\n%s",getAuthor(),getReviewStars(),getReview());
        return returnString;
    }
}
