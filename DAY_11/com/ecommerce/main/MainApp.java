package DAY_11.com.ecommerce.main;

import DAY_11.com.ecommerce.service.CartService;
import DAY_11.com.ecommerce.model.Product;
import DAY_11.com.ecommerce.util.DiscountUtil;

 
 
public class MainApp {
    public static void main(String[] args) {
        CartService cart=new CartService();
        Product p1=new Product(1,"iPhone 18 Pro max",DiscountUtil.applyDiscount(175000));
        Product p2=new Product(2,"Redmi Note 15 Pro Max",DiscountUtil.applyDiscount(60000));
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.showCart();
        int totalAmount=cart.calculateTotal();
        System.out.println("Total Amount: ₹ "+totalAmount);
    }
}
