package decoratorPattern;

public class DarkRoast extends Beverage{

    String description = "다크 로스트";

    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
