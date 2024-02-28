package factoryMethod;

public class RoundButtonFactory implements ButtonFactory{

    @Override
    public Button createButton() {
        System.out.println("Round button created!");
        return new RoundButton();
    }
}
