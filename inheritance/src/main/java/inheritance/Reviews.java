package inheritance;

public class Reviews {

    public Restaurant potato;
    public Shop aShop;
    public Theater aTheater;

    private String author;
    private int reviewStars;
    private String review;

   public Reviews(String body, String author, int stars)
    {

        this.author = author;
        this.reviewStars = stars;
        this.review = body;
    }

    public String getAuthor(){return author; }

    public int getReviewStars(){return reviewStars;}

    public String getReview(){return review;}

    public String toString(Restaurant potato){
       return String.format("Restaurant: %s  %s  Stars: %d\nReviewer: %s\n%s", potato.getName(), potato.getPrice(), potato.getRestStars(), author, review);
    }

    public String toString(Theater aTheater){
        String returnString = String.format("**** %s ****\nMovie List:", aTheater.getName());
        for(String movie : aTheater.getMovies()){
            returnString += "\n" + movie;
        }
        returnString += String.format("\nReviewer: %s  Stars: %d\n%s",author,reviewStars,review);
        return returnString;
    }
}

