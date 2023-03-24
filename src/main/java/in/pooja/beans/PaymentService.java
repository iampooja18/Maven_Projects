package in.pooja.beans;

public class PaymentService {
	
	private IPayment payment;
	
	public PaymentService() {
		System.out.println("PaymentService :: 0-Constructor");
		}
	
	public PaymentService(IPayment payment) {
		System.out.println("Param-Constructor");
		this.payment = payment;
	}
	
	public void setPayment(IPayment payment) {
		System.out.println("Setter Method Called");
		this.payment = payment;
	}
	
	public void doPayment(double billAmt) {
		boolean status = payment.processPayment(billAmt);
		
		if(status) {
			System.out.println("Recipt Printing...");
		}else {
			System.out.println("Card Declined");
		}
	}

}
