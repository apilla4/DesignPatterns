
public class ICICIBank extends Bank {
	
	public ICICIBank() {	
		super();
	}
	
	public ICICIBank(Account account) {
		super(account);
	}

	@Override
	public void bankName() {
		System.out.println("ICICI Bank");
	}

	@Override
	Account openAccount() {
		return account;
		
	}
}