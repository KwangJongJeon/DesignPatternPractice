package factoryPattern;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Plum Tomato Sauce");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
