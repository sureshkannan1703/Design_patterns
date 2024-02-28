package decorator;

public class StrawberrySyrub extends IceCreamDecorator{

    public StrawberrySyrub(Incredient baseIncredient) {
        super(baseIncredient);
    }

    @Override
    public Double getCost() {
        return baseIncredient.getCost()+13;
    }

    @Override
    public String getDescription() {
        return baseIncredient.getDescription()+" Added Strawberry syrub";
    }
}
