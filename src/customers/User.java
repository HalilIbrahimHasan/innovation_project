package customers;

import java.util.Scanner;

import utilities.Company1Util;
import utilities.Company2Util;

public class User {

	private String name;
	private String lastName;
	Company1Util company1Util = new Company1Util();
	Company2Util company2Util = new Company2Util();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void buyProduct(int numOfOrder) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please select a company");
		System.out.println("You can type A for companyV1 or B for companyV2");
		char option = scan.next().toLowerCase().charAt(0);

		if (option == 'a') {
			System.out.println("Please select a product!");
			System.out.println("You can either choose V1 or V2");
			String option2 = scan.next();

			if (option2.equalsIgnoreCase("V1")) {
				company1Util.makeAnOrder(numOfOrder);
			} else if (option2.equalsIgnoreCase("V2")) {
				company1Util.makeAnOrder2(numOfOrder);

			} else {
				System.out.println("Wrong Option!");
				return;
			}

		} else if (option == 'b') {
			System.out.println("Please select a product!");
			System.out.println("You can either choose V1 or V2");
			String option2 = scan.next();
			if (option2.equalsIgnoreCase("V1")) {
				company2Util.makeAnOrder(numOfOrder);
			} else if (option2.equalsIgnoreCase("V2")) {
				company2Util.makeAnOrder2(numOfOrder);

			} else {
				System.out.println("Wrong Option!");
				return;
			}

		} else {
			System.out.println("This is not a valid option, please reprocess!");
		}

	}

}
