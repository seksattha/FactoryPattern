public class Marinara implements Sauce {
    @Override
    public void getDescription() {
        System.out.println("MARINARA SAUCE");
    }

    @Override
    public int cost() {
        return 1;
    }
}
