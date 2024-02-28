package abstractFactory;

public class RoundThemeFactory implements ThemeFactory{
    @Override
    public Button createButtonForTheme() {
        return new RoundButton().makeButton();
    }

    @Override
    public CheckBox createCheckBoxForTheme() {
        return new RoundCheckBox().createCheckBox();
    }
}
