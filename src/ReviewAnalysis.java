import java.util.ArrayList;

public class ReviewAnalysis {
    private Review[] allReviews;

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public ReviewAnalysis(Review[] reviews) {
        allReviews = reviews;
    }

    public double getAverageRating() {
        double sum = 0;
        int count = 0;
        for(int i = 0; i < allReviews.length; i++){
            sum += allReviews[i].getRating();
            count++;
        }
        return sum/count;
    }

    public ArrayList<String> collectComments() {
        ArrayList list = new ArrayList<String>();
        for(int i = 0; i < allReviews.length;i++){
            if(allReviews[i].getComment().contains("!") && !allReviews[i].getComment().substring(allReviews[i].getComment().length()-1).equals(".") && !allReviews[i].getComment().substring(allReviews[i].getComment().length()-1).equals("!")){
                list.add(i + "-" + allReviews[i].getComment() + ".");
            }
            else if(allReviews[i].getComment().contains("!")){
                list.add(i + "-" + allReviews[i].getComment());
            }
        }
        return list;
    }
}
