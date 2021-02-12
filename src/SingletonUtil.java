import java.io.Serializable;

public class SingletonUtil implements Serializable, Cloneable {

	// Declare private,static,volatile member of the same class-type in the class
	private static volatile SingletonUtil instance;

	// Constructor is declared as private
	private SingletonUtil() {
		// no operation
	}

	// Declare a static method to create only one instance (static factory method)
	public static SingletonUtil getInstance() {
		if (instance == null) {
			synchronized (SingletonUtil.class) {
				if (instance == null) {
					instance = new SingletonUtil();
				}
			}
		}
		return instance;
	}

	protected Object readResolve() {
		return instance;
	}

	// Override clone() method and throw CloneNotSupportedException to prevent
	// cloning the object
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException();
	}
}