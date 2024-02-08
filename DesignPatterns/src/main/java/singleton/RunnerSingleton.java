package singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnerSingleton {

    public static void main(String[] args) {


        ExecutorService service = Executors.newFixedThreadPool(25);
        for (int i = 1; i <= 25; i++) {
            service.submit(new SinletonCallable());
            service.submit(new SinletonCallable());
            service.submit(new SinletonCallable());
            service.submit(new SinletonCallable());
            service.submit(new SinletonCallable());
        }
    }

////Lazy Singleton Class Instance creation:
//       // Singleton first = new Singleton();  //Restricted.
//        Singleton first = Singleton.getInstance();
//        Singleton second = Singleton.getInstance();
//        System.out.println(first==second);   //Give true, Because both refer same object.
////Early Singleton Class Instance creation:
//        //SingletonEarly early = new SingletonEarly();  -> restricted.
//        SingletonEarly first1 = SingletonEarly.getInstance();
//        SingletonEarly second2 = SingletonEarly.getInstance();
//        System.out.println(first1==second2);   //Give true, Because both refer same object.
//    }
}
