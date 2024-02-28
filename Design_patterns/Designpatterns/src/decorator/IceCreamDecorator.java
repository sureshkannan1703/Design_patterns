package decorator;

public abstract class IceCreamDecorator implements Incredient{

    Incredient baseIncredient;

    public IceCreamDecorator(Incredient baseIncredient){
        this.baseIncredient = baseIncredient;
    }

}
