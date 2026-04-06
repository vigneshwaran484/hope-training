package ProductReviewSystem;

import java.util.List;


public interface Reviewable {
    void addReview(Review review) throws InvalidReviewException;
    List<Review> getReviews();
    double getAverageRating(); 
}
