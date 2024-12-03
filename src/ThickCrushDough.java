public class ThickCrushDough implements Dough {
    private static final int thickness = 6;
    @Override
    public void getDescription() {
        System.out.println("Thin Crust, Thickness =>" + thickness);
    }

    @Override
    public int cost() {
        return 7;
    }

}
