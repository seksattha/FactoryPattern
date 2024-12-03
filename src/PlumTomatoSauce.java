public class PlumTomatoSauce implements Sauce {
    @Override
    public void getDescription() {
        System.out.println("TOMATO PLUM SAUCE");
    }

    @Override
    public int cost() {
        return 2;
    }
}
