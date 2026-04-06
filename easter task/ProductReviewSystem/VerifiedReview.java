package ProductReviewSystem;


public class VerifiedReview extends Review {
    private boolean isVerifiedPurchase;

    public VerifiedReview(User reviewer, int rating, String comment) throws InvalidReviewException {
        super(reviewer, rating, comment);
        this.isVerifiedPurchase = true; 
    }

    public boolean isVerifiedPurchase() { return isVerifiedPurchase; }

    @Override
    public void displayReview() {
        System.out.println("Verified Review (✓ Purchase Verified) - " + getReviewer().getUserName() + " (" + getRating() + " stars)");
        System.out.println("Comment: " + getComment());
        System.out.println("Timestamp: " + getTimestamp());
    }
}
