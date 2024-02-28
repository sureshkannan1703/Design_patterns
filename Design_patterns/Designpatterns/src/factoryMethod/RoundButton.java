package factoryMethod;

public class RoundButton implements Button {

    RoundButton(){
        System.out.println("I'm Round Button!");
    }

    @Override
    public Button makeButton() {
        return new RoundButton();
    }
}
