package abstractFactory;

public class RoundCheckBox implements CheckBox{

    @Override
    public CheckBox createCheckBox() {
        System.out.println("Round checkbox created!");
        return new RoundCheckBox();
    }
}
