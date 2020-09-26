package products;

public class ProductV1 {

	//Here is the product information so they represent our products
	private String productName;
	private int productId;
	private double price;
	final public static int productVersion = 1; 
	
	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
