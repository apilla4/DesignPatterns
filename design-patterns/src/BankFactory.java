public class BankFactory extends AbstractFactory {
	@Override
	public Bank getBank(boolean icici) {
		if (icici) {
			return new ICICIBank();
		} else {
			return new YesBank();
		}
	}

	@Override
	public Account getAccount(boolean savings) {
		return null;
	}
}