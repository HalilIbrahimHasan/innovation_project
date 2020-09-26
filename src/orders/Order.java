package orders;

import companies.*;
import plans.*;

public class Order {
	
	Plan1 plan1 = new Plan1();
	Plan2 plan2 = new Plan2();
	
	

	
	public void order(int orderVersion, int numOfOrder, String productName,double productPrice) {
		
		if(numOfOrder > 3) {
			System.out.println("You can make max 3 orders");
			return;
		}
		if(orderVersion == 1)
			plan1.plan(productName, productPrice, numOfOrder);
		else 
			plan2.plan(productName, productPrice, numOfOrder);
	}

	
	

}
