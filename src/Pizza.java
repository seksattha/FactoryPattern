import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
//    instance variables
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();

    void prepare() {
        System.out.println("Preparing" + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding source");
        System.out.println("Adding toppings");
        for (String topping : toppings) {
            System.out.println("     " + topping);
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes  at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slice");
    }

    void box() {
        System.out.println("Place pizza in Official PizzaStore Box");

    }

    public String getName() {
        return name;
    }

}
