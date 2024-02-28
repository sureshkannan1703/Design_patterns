package abstractFactory;

public class mainStage {

    private static ThemeFactory factory = new RectangleThemeFactory();

    public static void main(String[] args) {

        factory.createButtonForTheme();
        factory.createCheckBoxForTheme();
    }
}
