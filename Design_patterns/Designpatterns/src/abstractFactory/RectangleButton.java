package abstractFactory;

public class RectangleButton implements Button {

    @Override
    public Button makeButton() {
        System.out.println("Rectangle Button created!");
        return new RectangleButton();
    }
}
