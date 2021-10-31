package tr.com.kuru.harun;

public class Demo {

	public static void main(String[] args) {
		
	Payment pm = new Payment();
	pm.pay();
	Payment pmc = new CashPayment();
	pmc.pay();
	Payment pmcp = new CreditPayment();
	pmcp.pay();
	Payment pmcpd = new DeferredPayment();
	pmcpd.pay();

	
	}

}
