package abstractFactory;

public class RectangleThemeFactory implements ThemeFactory{
    @Override
    public Button createButtonForTheme() {
        return new RectangleButton().makeButton();
    }

    @Override
    public CheckBox createCheckBoxForTheme() {
        return new RectangleCheckBox().createCheckBox();
    }
}
