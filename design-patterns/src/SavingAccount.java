public class SavingAccount implements Account {

	private double interest;
	private String accCode;
    private boolean active;
    private double dailyLimit = 4000;
    
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public String getAccCode() {
		return accCode;
	}

	public void setAccCode(String accCode) {
		this.accCode = accCode;
	}

	private SavingAccount(SavingAccountBuilder builder) {
		this.accCode = builder.accountCode;
	}

	@Override
	public String accountType() {
		return "SAVING";
	}

	public static class SavingAccountBuilder {

		private double interest;
		private final String accountCode;
		private boolean active;

		public SavingAccountBuilder(String accountCode) {
			this.accountCode = accountCode;
		}

		public SavingAccountBuilder interest(double interest) {
			this.interest = interest;
			return this;
		}
		
		public SavingAccountBuilder active(boolean active) {
			this.active = active;
			return this;
		}

		public SavingAccount build() {
			SavingAccount account = new SavingAccount(this);
			return account;
		}

	}

	@Override
	public String accountBenefit() {
		 return "This account has 4% interest rate with per day $5000 withdrawal limit"; 
	}


    
    public void withdraw() {
    	System.out.println("Validation succeeded");
    	System.out.println("Withdrawal completed");
    }

	@Override
	public void accept(AccountVisitor operation) {
		if(operation instanceof WithdrawalOperation) {
			new WithdrawalOperation().withdraw(this);
		}
		
	}





}