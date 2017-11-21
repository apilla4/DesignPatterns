public class AccountService {
    public static Account getAccount(String accountId) {
        return new AccountFactory().getAccount(true);
    }
    
    public static Account deactivate(Account account) {
        if(account.accountType().equals("SAVING")) {
            SavingAccount acc = (SavingAccount) account;
            acc.setActive(false);
            return acc;
        }
		return null;
        
    }
}