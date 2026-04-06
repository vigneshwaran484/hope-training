package ProductReviewSystem;

import java.util.Date;

public abstract class Review {
    private User reviewer;
    private int rating;
    private String comment;
    private Date timestamp;

    public Review(User reviewer, int rating, String comment) throws InvalidReviewException {
        if (rating < 1 || rating > 5) {
            throw new InvalidReviewException("Rating must be between 1 and 5 stars.");
        }
        if (comment == null || comment.trim().isEmpty()) {
            throw new InvalidReviewException("Review comment cannot be empty.");
        }
        this.reviewer = reviewer;
        this.rating = rating;
        this.comment = comment;
        this.timestamp = new Date();
    }

    public User getReviewer() { return reviewer; }
    public int getRating() { return rating; }
    public String getComment() { return comment; }
    public Date getTimestamp() { return timestamp; }
    public abstract void displayReview();
}
