public class Application {
    public static void main(String[] args) {
        PizzaStore NyStore = new NYPizzaStore();
        NyStore.orderPizza("cheese");

        PizzaStore ChicagoStore = new ChicagoPizzaStore();
        ChicagoStore.orderPizza("cheese");
    }
}
