public interface AccountVisitor {
    
	//withdrawal
    public void withdraw(SavingAccount account);
    public void withdraw(CurrentAccount account);

}