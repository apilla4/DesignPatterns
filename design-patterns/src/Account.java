public interface Account {


	String accountType();
	
	String accountBenefit();
	
	void accept(AccountVisitor operation);


}