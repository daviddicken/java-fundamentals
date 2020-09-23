package inheritance;

public class Reviews {

    public Restaurant potato;

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

    public String toString(){
       return String.format("Restaurant: %s  %s  Stars: %d\nReviewer: %s\n%s", potato.getName(), potato.getPrice(), potato.getRestStars(), author, review);

    }
}

