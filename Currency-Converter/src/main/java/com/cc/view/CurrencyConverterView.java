package com.cc.view;

import java.util.Scanner;

import com.cc.model.Currency;

public class CurrencyConverterView {

	static Scanner myInput = new Scanner(System.in);
	static Currency currency = new Currency();

	public static void main(String[] args) {

		do {
			System.out.println("Welcome to Currency Converter : ");
			System.out.println(
					"1.doller  to rupee  convertor :\n2.euro to rupee  convertor\n3.British Pound to rupee  convertor");
			int input = myInput.nextInt();
			myInput.nextLine();
			switch (input) {
			case 1:
				System.out.println("Enter ammout in doller :");
				double doller = myInput.nextDouble();
				currency.setUsd(doller);
				myInput.nextLine();
				currency.setRupee(doller * 80);
				System.out.println("=============================================================================");
				System.out.println("converted value of " + doller + "$  is indian rupee " + currency.getRupee());
				System.out.println("=============================================================================");

				break;
			case 2:
				System.out.println("Enter amount in euro :");
				double euro = myInput.nextDouble();
				currency.setEuro(euro);
				myInput.nextLine();
				currency.setRupee(euro * 89.93);
				System.out.println("=============================================================================");
				System.out.println("converted value of " + euro + "$  is indian rupee " + currency.getRupee());
				System.out.println("=============================================================================");
				break;
			case 3:
				System.out.println("Enter amount in pound :");
				double pound = myInput.nextDouble();
				currency.setPound(pound);
				myInput.nextLine();
				currency.setRupee(pound * 104);
				System.out.println("=============================================================================");
				System.out.println("converted value of " + pound + "$  is indian rupee " + currency.getRupee());
				System.out.println("=============================================================================");
				break;
			case 4:

				break;

			default:
				System.out.println("please enter valid input ");
				break;
			}
		} while (true);

	}
}
