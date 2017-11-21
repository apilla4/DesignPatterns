public class YesBank extends Bank {
	
	public YesBank() {
		super();
	}
	
	public YesBank(Account account) {
		super(account);
	}
	
	@Override
	public void bankName() {
		System.out.println("Yes Bank");
	}

	@Override
	Account openAccount() {
		return account;
	}
}