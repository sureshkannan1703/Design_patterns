package factoryMethod;

public class mainFactoryMethod {

    private static ButtonFactory factory = new RectangleButtonFactory();
    public static void main(String[] args) {

        factory.createButton();

    }
}

/*
    Now we can only make changes int new RectangleButtonFactory()/new RoundButtonFactory().
     in case if we want to change;

    Class explosion is violated in factory method implementation.
 */