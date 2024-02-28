package abstractFactory;

public class RoundButton implements Button {

    @Override
    public Button makeButton() {
        return new RoundButton();
    }
}
