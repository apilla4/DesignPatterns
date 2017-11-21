public abstract class Bank {

	protected Account account;
	
	public Bank() {	
	}
	
	public Bank(Account account) {
		this.account = account;
	}
	
	abstract void bankName();
	
	abstract Account openAccount();
	
}