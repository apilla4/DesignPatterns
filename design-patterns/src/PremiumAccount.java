
public class PremiumAccount extends AccountDecorator {

	private Account account;
	
	public PremiumAccount(Account account) {
		super();
		this.account = account;
	}
	
	@Override
	public String accountBenefit() {
		 return account.accountBenefit() + " other benefits are  "+applyAdditionalBenefit(); 
	}

	@Override
	String applyAdditionalBenefit() {
		return " an medical insurance of up to $1,000 for Premium Account"; 
	}

	@Override
	public String accountType() {
		return account.accountType();
	}

	@Override
	public void accept(AccountVisitor operation) {
		// TODO Auto-generated method stub
		
	}


}
