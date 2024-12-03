public class NYPizzaStore extends PizzaStore {


    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
            if (item.equals("cheese")) {
                pizza = new CheesePizza(ingredientFactory);
            } else {
                System.out.println("Not Available");
                return null;
            }
            return pizza;
        }
    }

