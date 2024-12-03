public class ThinCrustDough implements Dough{
    private static final int thickness = 3;
    @Override
    public void getDescription() {
        System.out.println("Thin Crust, Thickness =>" + thickness);
    }

    @Override
    public int cost() {
        return 3;
    }
}
