package plans;

import java.util.*;

public class Plan2 {

	public void plan(String productName, double productPrice, int numOfOrder) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Which option would you like to choose?");
		System.out.println("Here are the options you need to select");
		System.out.println("Option A: You can add a plan to your order");
		System.out.println("Option B: You can buy and pay right away!");
		System.out.println("Please click either A or B");
		char order = scan.next().toLowerCase().charAt(0);
		
		if(order == 'a') {
			System.out.println("Your order has been placed to cart!");
			orderMassage(productName,productPrice,numOfOrder);
		}else if(order == 'b') {
			orderMassage(productName,productPrice,numOfOrder);

			System.out.println("You can chose your item and pay right away!");

		}else {
			System.out.println("You have a wrong option! PLease try again!");
			return;
		}
	}
	
	
	
	public void orderMassage(String productName, double productPrice, int numOfOrder) {
		System.out.println("Here is the product name: $"+productName);
		System.out.println("Here is the product price: $"+productPrice);
		System.out.println("total price: "+productPrice*numOfOrder);
	}
}
