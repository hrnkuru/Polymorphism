package tr.com.kuru.harun;

public class CreditPayment extends Payment {
	
	@Override
	void pay() {
		System.out.println("CreditPayment class pay method");
	};
}
