package decorator;

public class ChocoCone implements Incredient{

    @Override
    public Double getCost() {
        return 10.0;
    }

    @Override
    public String getDescription() {
        return "Base cone";
    }
}
