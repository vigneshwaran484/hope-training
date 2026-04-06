package ProductReviewSystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a product being reviewed.
 * Demonstrates Abstraction: Implements Reviewable interface.
 * Demonstrates Composition: Product has a list of Reviews.
 */
public class Product implements Reviewable {
    private String productId;
    private String name;
    private List<Review> reviews;

    public Product(String productId, String name) {
        this.productId = productId;
        this.name = name;
        this.reviews = new ArrayList<>();
    }

    // Getters
    public String getProductId() { return productId; }
    public String getName() { return name; }

    @Override
    public void addReview(Review review) throws InvalidReviewException {
        if (review == null) {
            throw new InvalidReviewException("Review object cannot be null.");
        }
        reviews.add(review);
        System.out.println("Review added for " + name + " by " + review.getReviewer().getUserName());
    }

    @Override
    public List<Review> getReviews() {
        return reviews;
    }

    @Override
    public double getAverageRating() {
        if (reviews.isEmpty()) return 0.0;
        double sum = 0;
        for (Review r : reviews) {
            sum += r.getRating();
        }
        return sum / reviews.size();
    }

    public void displayAllReviews() {
        System.out.println("\n--- All Reviews for: " + name + " (Avg Rating: " + String.format("%.1f", getAverageRating()) + ") ---");
        for (Review r : reviews) {
            r.displayReview(); 
            System.out.println("----------------------------------------");
        }
    }
}
