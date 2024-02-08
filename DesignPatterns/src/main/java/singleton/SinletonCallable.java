package singleton;

import java.util.concurrent.Callable;

public class SinletonCallable implements Callable<DoubleCheckSingleton> {
    @Override
    public DoubleCheckSingleton call() throws Exception {
        DoubleCheckSingleton ss = DoubleCheckSingleton.getInstance();
        System.out.println(ss);
        return ss;
    }
}
