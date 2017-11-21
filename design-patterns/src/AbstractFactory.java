public abstract class AbstractFactory {

	abstract Bank getBank(boolean icici);

	abstract Account getAccount(boolean savings);

}