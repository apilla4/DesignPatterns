import java.util.ArrayList;
import java.util.List;


public class CompositeBankAccount {

	List<Account> childAccounts = new ArrayList<>();

	public void add(Account account) {
		childAccounts.add(account);
	}
	
	public void remove(Account account) {
		childAccounts.remove(account);
	}

}
