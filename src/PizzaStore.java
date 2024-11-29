public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    //    Factory Method!! จะต้องเป็น Protected เพื่อไม่ให้เอาไปใช้ที่คลาสอืนๆ ได้
    protected abstract Pizza createPizza(String type);
}
