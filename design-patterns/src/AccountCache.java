import java.util.HashMap;
import java.util.Map;

public class AccountCache {

	public static Map<String, Account> accountCacheMap = new HashMap<>();

	static {

		AccountFactory factory = new AccountFactory();

		Account savingAccount = factory.getAccount(true);
		Account currentAccount = factory.getAccount(false);

		accountCacheMap.put("SAVING", savingAccount);
		accountCacheMap.put("CURRENT", currentAccount);

	}
}