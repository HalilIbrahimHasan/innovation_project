package utilities;

import companies.*;
import metadata.Data;
import orders.*;
import products.ProductV1;
import products.ProductV2;

public class Company1Util extends Data {

	Company1 company1 = new Company1();
	ProductV1 productV1 = new ProductV1();
	ProductV2 productV2 = new ProductV2();
	Order order1 = new Order();

	public void makeAnOrder(int numberOfOrder) {
		setProductV1();
		setCompany();
		order1.order(productV1.productVersion, numberOfOrder, productV1.getProductName(), productV1.getPrice());

	}

	public void makeAnOrder2(int numberOfOrder) {
		setProductV2();
		setCompany();
		order1.order(productV2.productVersion, numberOfOrder, productV2.getProductName(), productV2.getPrice());

	}

	public void setCompany() {
		company1.setProductV1(productV1);
	}

	public void setProductV1() {

		productV1.setProductName(productNames[0]);
		productV1.setProductId(productIds[0]);
		productV1.setPrice(prices[0]);

	}

	public void setProductV2() {

		productV2.setProductName(productNames[1]);
		productV2.setProductId(productIds[1]);
		productV2.setPrice(prices[1]);

	}

}
