package tr.com.kuru.harun;

public class CashPayment extends Payment {
	
	@Override
	void pay() {
		System.out.println("CashPayment class pay method");
	};
}
