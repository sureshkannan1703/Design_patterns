package singleton;

public class Singleton implements Runnable{
    /* Singleton Lazy Initialization.*/
    public static Singleton INSTANCE = null;
    private Singleton(){
    }

    public static Singleton getInstance(){

        if(INSTANCE==null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    @Override
    public void run() {
        System.out.println(INSTANCE);
    }
}
