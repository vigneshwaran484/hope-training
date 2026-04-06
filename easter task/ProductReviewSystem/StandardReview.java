package ProductReviewSystem;

import java.util.Date;

public class StandardReview extends Review {

    public StandardReview(User reviewer, int rating, String comment) throws InvalidReviewException {
        super(reviewer, rating, comment);
    }

    @Override
    public void displayReview() {
        System.out.println("Standard Review from " + getReviewer().getUserName() + " - " + getRating() + " stars.");
        System.out.println("Comment: " + getComment());
        System.out.println("Timestamp: " + getTimestamp());
    }
}
