package tr.com.kuru.harun;

public class DeferredPayment extends Payment {
	
	@Override
	void pay() {
		System.out.println("DeferredPayment class pay method");
	};
}
