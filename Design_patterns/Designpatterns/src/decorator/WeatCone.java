package decorator;

public class WeatCone implements Incredient{
    @Override
    public Double getCost() {
        return 8.0;
    }

    @Override
    public String getDescription() {
        return "Base Weatcone";
    }
}
