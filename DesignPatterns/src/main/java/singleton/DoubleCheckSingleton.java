package singleton;

public class DoubleCheckSingleton {

    public static  DoubleCheckSingleton INSTANCE=null;
    private DoubleCheckSingleton(){
    }

    public static DoubleCheckSingleton getInstance(){

        if(INSTANCE==null) {
            synchronized (DoubleCheckSingleton.class) {
                if(INSTANCE==null)
                    INSTANCE = new DoubleCheckSingleton();
            }
        }
        return INSTANCE;
    }
}
