public class CurrentAccount implements Account {
	@Override
	public String accountType() {
		System.out.println("CURRENT");
		return "CURRENT";
	}

	@Override
	public String accountBenefit() {
		return "There is no withdrawal limit for current account"; 
	}

    public void withdraw() {
    	System.out.println("Withdrawal completed");
    }

	@Override
	public void accept(AccountVisitor operation) {
		if(operation instanceof WithdrawalOperation) {
			new WithdrawalOperation().withdraw(this);
		}
		
	}



}