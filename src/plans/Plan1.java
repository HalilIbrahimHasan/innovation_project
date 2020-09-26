package plans;

public class Plan1 {
	
	
	public void plan(String productName, double productPrice, int numOfOrder) {
		System.out.println("Here is the product: "+productName );
		System.out.println("Product price: $"+productPrice);
		System.out.println("total price: $"+productPrice*numOfOrder);
		System.out.println("Your order has been added to cart and the plan has been applied");
	}

}
