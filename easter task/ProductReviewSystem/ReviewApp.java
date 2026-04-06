package ProductReviewSystem;


public class ReviewApp {
    public static void main(String[] args) {

        Product laptop = new Product("LAP01", "Gaming Laptop");
        Product phone = new Product("PHN02", "Smart Phone");

        User alice = new User("U01", "Alice", "alice@example.com");
        User bob = new User("U02", "Bob", "bob@example.com");
        User charlie = new User("U03", "Charlie", "charlie@example.com");

        System.out.println("--- Starting Product Review System Test ---");

        try {
            
            Review r1 = new StandardReview(alice, 5, "Amazing laptop! Very fast.");
            laptop.addReview(r1);

       
            Review r2 = new VerifiedReview(bob, 4, "Great screen, but gets a bit hot.");
            laptop.addReview(r2);

 
            Review r3 = new StandardReview(charlie, 3, "Decent but overpriced.");
            laptop.addReview(r3);

            Review r4 = new VerifiedReview(alice, 5, "The camera is incredible!");
            phone.addReview(r4);

             try {
                System.out.println("\n--- Testing Invalid Rating (6 stars) ---");
                new StandardReview(bob, 6, "Excellent!");
            } catch (InvalidReviewException e) {
                System.err.println("Caught Expected Error: " + e.getMessage());
            }

            try {
                System.out.println("\n--- Testing Empty Comment ---");
                new StandardReview(bob, 4, "");
            } catch (InvalidReviewException e) {
                System.err.println("Caught Expected Error: " + e.getMessage());
            }

        } catch (InvalidReviewException e) {
            System.err.println("Unexpected Error: " + e.getMessage());
        }

        laptop.displayAllReviews();

        phone.displayAllReviews();

        System.out.println("\n--- Test Complete ---");
    }
}
