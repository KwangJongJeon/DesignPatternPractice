package factoryPattern;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        name = "Chicago Style Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Clam Sauce";

        toppings.add("Clam");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
