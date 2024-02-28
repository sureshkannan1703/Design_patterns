package decorator;

public class Main {

    public static void main(String[] args) {

        //1. First combination Icecream.
        ChocoCone iceCream_1_base = new ChocoCone();
        Incredient iceCream_1 = new ChocoChips(new MangoSyrub(iceCream_1_base));

        //2. Second combination Icecream.
        WeatCone iceCream_2_base = new WeatCone();
        Incredient iceCream_2 = new ChocoChips(new StrawberrySyrub(iceCream_2_base));
    }
}
