public class NYPizzaStore extends PizzaStore {


    @Override
    protected Pizza createPizza(String item) {
            if (item.equals("cheese")) {
                return new NYStyleCheesePizza();
            } else {
                System.out.println("Not Available");
                return null;
            }
        }
    }

