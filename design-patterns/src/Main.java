public class Main {
	public static void main(String args) {

		// factory pattern
		AccountFactory factory = new AccountFactory();
		Account acc = factory.getAccount(true); // true returns SavingAccount

	}
}