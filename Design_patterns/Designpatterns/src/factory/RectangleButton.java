package factory;

import java.awt.*;

public class RectangleButton implements Button{

    RectangleButton(){
        System.out.println("I'm Rectangle Button!");
    }

    @Override
    public Button makeButton() {
        return new RectangleButton();
    }
}
