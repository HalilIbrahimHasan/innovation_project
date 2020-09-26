package utilities;

import companies.Company1;
import companies.Company2;
import metadata.Data;
import orders.Order;

import products.ProductV1;
import products.ProductV2;

public class Company2Util extends Data {

	Company2 company2 = new Company2();
	ProductV1 productV1 = new ProductV1();
	ProductV2 productV2 = new ProductV2();
	Order order1 = new Order();

	public void makeAnOrder(int numberOfOrder) {
		setProductV1();
		setCompany();
		order1.order(productV1.productVersion, numberOfOrder, productV2.getProductName(), productV2.getPrice());
		
	}

	public void makeAnOrder2(int numberOfOrder) {
		setProductV2();
		setCompany();
		order1.order(productV2.productVersion, numberOfOrder, productV2.getProductName(), productV2.getPrice());

	}

	public void setCompany() {
		company2.setProductV2(productV2);
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
