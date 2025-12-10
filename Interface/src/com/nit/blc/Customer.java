package com.nit.blc;

import java.util.Scanner;


sealed interface Payment 
{
	void makePayment(double amount);
	void makeRefund(double amount);

}

//CreditCard payment starts............................

final class CreditCardpayment implements Payment {
	
	private String cardHolderName;
    
	
	public CreditCardpayment(String cardHolderName) {
		super();
		this.cardHolderName = cardHolderName;
	}

	@Override
	public void makePayment(double amount) {
		System.out.println("paid rs : "+amount+" using credit card holder : "+cardHolderName);
		
	}

	@Override
	public void makeRefund(double amount) {
		System.out.println("Cancelling order for amount RS  : "+amount);
		System.out.println("Refunded RS :"+amount+" to credit card holder: "+cardHolderName);
		
	}
}

// debitcard starts............................

final class DebitCardPayment implements Payment{
	
	private String bankName;
	
	

	public DebitCardPayment(String bankName) {
		super();
		this.bankName = bankName;
	}

	@Override
	public void makePayment(double amount) {
		
		System.out.println("paid rs : "+amount+" using debit card bank : "+bankName);
	}

	@Override
	public void makeRefund(double amount) {
		System.out.println("Cancelling order for amount RS  : "+amount);
		System.out.println("Refunded RS :"+amount+" to debit card bank: "+bankName);
		
	}
	
}

//  upi payment starts............................

final class UPIPayment implements Payment{
	private String upiId;

	public UPIPayment(String upiId) {
		super();
		this.upiId = upiId;
	}

	@Override
	public void makePayment(double amount) {
		System.out.println("paid rs : "+amount+" using upi id : "+upiId);
		
	}

	@Override
	public void makeRefund(double amount) {
		System.out.println("Cancelling order for amount RS  : "+amount);
		System.out.println("Refunded RS :"+amount+" to upi id: "+upiId);
		
	}
	
}

class ShoppingCart{
	private double totaolAmount;

	public ShoppingCart(double totaolAmount) {
		super();
		this.totaolAmount = totaolAmount;
	}
	
	public void checkOut(Payment payment) {
		System.out.println("starting checkout for RS : "+totaolAmount);
		if(payment instanceof CreditCardpayment c) {
			c.makePayment(totaolAmount);
		}
		else if(payment instanceof DebitCardPayment d) {
			d.makePayment(totaolAmount);
		}
		else if(payment instanceof UPIPayment u) {
			u.makePayment(totaolAmount);
		}
	}
	
	public void cancelOrder(Payment payment) {
		System.out.println("order cancelled. initializing refund...");
		if(payment instanceof CreditCardpayment c) {
			c.makeRefund(totaolAmount);
		}
		else if(payment instanceof DebitCardPayment d) {
		d.makeRefund(totaolAmount);
		}
		else if(payment instanceof UPIPayment u) {
			u.makeRefund(totaolAmount);
		}
	}
}
public class Customer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter bill amount");
		double amount = Double.parseDouble(sc.nextLine());
		System.out.println("choose payment method");
		System.out.println("1. credit card");
		System.out.println("2. debit card");
		System.out.println("3. upi");
		System.out.println("enter choice");
		int choice=Integer.parseInt(sc.nextLine());
		ShoppingCart s = new ShoppingCart(amount);
		Payment p;
		if(choice==1) {
			System.out.println("enter card holder name");
			String name = sc.nextLine();
			p = new CreditCardpayment(name);
			s.checkOut(p);
			s.cancelOrder(p);
		}
		else if(choice==2) {
			System.out.println("enter debit card bank name");
			String bank = sc.nextLine();
			p = new DebitCardPayment(bank);
			s.checkOut(p);
			s.cancelOrder(p);
		}
		else if(choice==3) {
			System.out.println("enter upi id");
			String upi = sc.nextLine();
			p = new UPIPayment(upi);
			s.checkOut(p);
			s.cancelOrder(p);
		}
	}
	
}





















