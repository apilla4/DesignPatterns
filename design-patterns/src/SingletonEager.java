public class SingletonEager {
	// this is better for runtime performance
	private static final SingletonEager instance = new SingletonEager();

	private SingletonEager() {

	}

	public static SingletonEager getInstance() {
		return instance;
	}
}