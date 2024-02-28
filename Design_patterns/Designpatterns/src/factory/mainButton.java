package factory;

public class mainButton {

    private static Button button = ButtonFactory.createButton(ButtonType.RECTANGLE);
    public static void main(String[] args) {

        System.out.println(button.getClass());
    }
}
