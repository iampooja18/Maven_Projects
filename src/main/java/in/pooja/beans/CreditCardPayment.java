package in.pooja.beans;

public class CreditCardPayment implements IPayment{
	
	public CreditCardPayment() {
		System.out.println("CreditCardPayment :: Contructor");
	}
	
	public boolean processPayment(double billAmt) {
		System.out.println("CreditCard Payment Successfull...");
		return true;
	}

}
