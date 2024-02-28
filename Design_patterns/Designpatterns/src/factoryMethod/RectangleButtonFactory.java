package factoryMethod;

public class RectangleButtonFactory implements ButtonFactory{
    @Override
    public Button createButton() {
        System.out.println("Rectangle button created!");
        return new RectangleButton();
    }
}
