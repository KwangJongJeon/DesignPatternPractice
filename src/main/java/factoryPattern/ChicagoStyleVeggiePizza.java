package factoryPattern;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Veggie sauce";

        toppings.add("Tomato sauce");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
