package org.tnsif.acce.c2tc.super_this_instanceof;

class PaymentMethod {
	void makePayment() {
		System.out.println("Processing Payment");
	}
}
class CreditCard extends PaymentMethod{
	void swipeCard() {
		System.out.println("Swiping Card");
	}
}
class PayPal extends PaymentMethod{
	void loginToPayPal() {
		System.out.println("Login to paypal ");
	}
}



public class InstanceofDemo2 {

	public static void main(String[] args) {
		
		PaymentMethod payment=new PaymentMethod();
		
		payment =new PayPal();//Dynamic Type Checking
		
		if (payment instanceof CreditCard) {
			CreditCard cc=(CreditCard)payment;//upcasting conv payment tp creditcard
			cc.swipeCard();
		}
		else if(payment instanceof PayPal)
		{
			PayPal pp =(PayPal)payment;//upcasting conv payment paypal
			pp.loginToPayPal();
		}

	}

}