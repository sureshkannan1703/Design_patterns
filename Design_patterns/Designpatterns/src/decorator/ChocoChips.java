package decorator;

public class ChocoChips extends IceCreamDecorator{


    public ChocoChips(Incredient baseIncredient) {
        super(baseIncredient);
    }

    @Override
    public Double getCost() {
        return baseIncredient.getCost();
    }

    @Override
    public String getDescription() {
        return baseIncredient.getDescription()+" Added Choco Chips";
    }
}
