public class Application {
    public static void main(String[] args) {
        for (int i = 0 ; i < 10 ; i++) {
            PizzaStore NyStore = new NYPizzaStore();
            NyStore.orderPizza("cheese");
        }

        PizzaStore ChicagoStore = new ChicagoPizzaStore();
        ChicagoStore.orderPizza("cheese");
    }
}
