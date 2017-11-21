public class FactoryProducer {
	public AbstractFactory getFactory(boolean accountFactory) {
		if (accountFactory) {
			return new AccountFactory();
		} else {
			return new BankFactory();
		}
	}
}