public class AdvancedPaymentGatewayAdapter implements AdvancedPaymentGateway {

	private OldPaymentGateway gateway;

	public AdvancedPaymentGatewayAdapter(OldPaymentGateway gateway) {
		this.gateway = gateway;
	}

	@Override
	public void makePayment(String mobile1, String mobile2) {

		Account account1 = null; //get account using mobile1
		Account account2 = null; //get account using mobile2

		gateway.doPayment(account1, account2); //now this still supports the


	}
}