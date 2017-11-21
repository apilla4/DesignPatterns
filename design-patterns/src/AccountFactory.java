public class AccountFactory extends AbstractFactory {

	@Override
	public Account getAccount(boolean savings) {
		if (savings) {
			return new SavingAccount.SavingAccountBuilder("SV").build();
		} else {
			return new CurrentAccount();
		}

	}

	@Override
	public Bank getBank(boolean icici) {
		return null;
	}

}