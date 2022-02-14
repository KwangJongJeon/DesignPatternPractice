package factoryPattern.ingredient;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public pepperoni createPepperoni();
    public Clams createClam();
}
