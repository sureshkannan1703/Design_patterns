package singleton;

/*Singleton Early Initialization
* It's worth noting that early initialization can be efficient, but it might not be suitable for cases where the
* creation of the singleton instance is resource-intensive or depends on external configurations. In such cases,
* lazy initialization (creating the instance only when it is requested for the first time) may be more appropriate.
*
* */
public class SingletonEarly {

    private static final SingletonEarly INSTANCE = new SingletonEarly();

    private SingletonEarly(){
    }

    public static SingletonEarly getInstance(){
        return INSTANCE;
    }
}
