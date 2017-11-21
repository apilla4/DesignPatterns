public class WithdrawalOperation implements AccountVisitor {
	
    //visitor pattern allows you to add multiple methods for diff objects.
	//for strategy you need to create extra classes for diff objects, like Savings and Current
    //strategy is useful if you have one object and want to perform multiple operation on it
	
	public void withdraw(SavingAccount account) {
        account.withdraw();
    }
    
    public void withdraw(CurrentAccount account) {
        account.withdraw();
    }
}