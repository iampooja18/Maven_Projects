package in.pooja.beans;

public class DebitCardPayment implements IPayment {
	
	public DebitCardPayment() {
		System.out.println("DebitCardPayment :: Constructor");
	}
	
	public boolean processPayment(double billAmt) {
		System.out.println("DebitCard Payment Successfull...");
	     return true;
	     
	}
	

}
