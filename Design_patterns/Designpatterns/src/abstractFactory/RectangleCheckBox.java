package abstractFactory;

public class RectangleCheckBox implements CheckBox{

    @Override
    public CheckBox createCheckBox() {
        System.out.println("Rectangle checkbox created!");
        return new RectangleCheckBox();
    }
}
