package companies;

import products.*;

public class Company2 {

	//This is the company2 with its products
	
	// We are hiding the data using encapsulation so that we are the only one to set the data and 
	// get the data using getter and setters

	private ProductV1 productV1;

	private ProductV2 productV2;
	

	public ProductV1 getProductV1() {
		return productV1;
	}

	public void setProductV1(ProductV1 productV1) {
		this.productV1 = productV1;
	}

	public ProductV2 getProductV2() {
		return productV2;
	}

	public void setProductV2(ProductV2 productV2) {
		this.productV2 = productV2;
	}

}
