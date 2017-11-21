public class ProxySavingAccount {
	private Account account;

	public ProxySavingAccount(Account account) {
		this.account = account;
	}

	public String getAccountType() {

		if (IsAunthenticated(account)) //proxy here does the additional logic , security or caching 
			return account.accountType();
		else
			return null;

	}

	public boolean IsAunthenticated(Account account) {
		return true;
	}

}