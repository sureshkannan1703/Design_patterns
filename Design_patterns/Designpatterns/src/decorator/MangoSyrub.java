package decorator;

public class MangoSyrub extends IceCreamDecorator{
    public MangoSyrub(Incredient baseIncredient) {
        super(baseIncredient);
    }

    @Override
    public Double getCost() {
        return baseIncredient.getCost()+20;
    }

    @Override
    public String getDescription() {
        return baseIncredient.getDescription()+" Added Mango Syrub";
    }
}
