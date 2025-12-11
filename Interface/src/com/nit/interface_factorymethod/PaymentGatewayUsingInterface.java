package com.nit.interface_factorymethod;

import java.util.Scanner;

public class PaymentGatewayUsingInterface {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Payment Type [CreditCard / UPI]: ");
		String pay = sc.nextLine();
		PaymentGateway pg = new PaymentGateway();
		pg.initiatePayment(pay);
	}
}

//..................................................
interface Payment{
	
	void processPayment();
	void applyDiscount();
	
}

// .....................creditcarsd Pyment starts..............................................

class CreditCardPayment implements Payment {

	@Override
	public void processPayment() {
		System.out.println("Processing Credit Card payment...");
		
		
	}

	@Override
	public void applyDiscount() {
		System.out.println("Applying 5% discount for Credit Card payment");
		
		
	}
		
	
}
// ..............................upiPyment starts..............................................


class UPIPayment implements Payment{

	@Override
	public void processPayment() {
		System.out.println("Processing Credit Card payment...");
		
	}

	@Override
	public void applyDiscount() {
		System.out.println("Applying 10% discount for Credit Card payment");
		
	}
	
}
class PaymentGateway{
       
	
	public Payment initiatePayment(String paymenttype)
	{
		
		Payment p = null;
		if(paymenttype.equalsIgnoreCase("CreditCardPayment")) {
			p = new CreditCardPayment();
			p.applyDiscount();
			p.processPayment();
		}
		else if(paymenttype.equalsIgnoreCase("UPIPayment")) {
			
			p = new UPIPayment();
			p.applyDiscount();
			p.processPayment();
		}
		else {
			System.out.println("invalid");
			System.exit(0);
		}
			
			
		return p;
		}
		
		
	}


























