package inheritance;

import java.util.ArrayList;

public class Reviews extends Restaurant {

    private String author;
    private int reviewStars;
    private String review;

   public Reviews(String name, int restStars, String price, String body, String author, int stars)
    {
        super(name, restStars, price);

        this.author = author;
        this.reviewStars = stars;
        this.review = body;
    }

    // Array list to hold reviews
    public ArrayList<Restaurant> reviewList = new ArrayList<>();
    public void addToList(Reviews review){
        this.reviewList.add(review);
        review.reviewList.add(this);

    };



    public String getAuthor(){
       return author;
    }

    public int getRestStars(){
       return reviewStars;
    }

//    public String toString(){
////       String returnString = String.format("Restaurant- %s %s  Avg Stars:%d\nReviewer: %s   %d Stars\nReview: %s\n\n", getName(), getPrice(), getRestStars(), author, reviewStars, review);
//        String returnString = "";
//        //String returnString = String.format("Restaurant- %s %s  Avg Stars:%d\nReviewer: %s   %d Stars\nReview: %s\n\n", getName(), getPrice(), getRestStars(), author, reviewStars, review);
//        for(Restaurant review : this.reviewList){
//            returnString += review.getName() + " " + reviewStars + "\n";
//        }
//        return returnString;
//    }
}

