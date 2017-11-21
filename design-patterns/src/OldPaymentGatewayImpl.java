public class OldPaymentGatewayImpl implements OldPaymentGateway {

	@Override
	public void doPayment(Account account1, Account account2) {

		System.out.println("Do payment using old payment gateway");
	}
}