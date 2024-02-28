package factory;

public class ButtonFactory {

    public static Button createButton(ButtonType type){

        switch(type){
            case RECTANGLE :
                return new RectangleButton();
            case ROUND:
                return new RoundButton();
        }
        throw new IllegalArgumentException("Invalid type "+type);
    }
}
