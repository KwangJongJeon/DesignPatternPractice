package factoryPattern;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        name = "NY Style Sauce and Pepperoni Pizza";
        dough = "Thin Crust Dough";
        sauce = "Tomato Sauce";

        toppings.add("Pepperoni");
    }
}
