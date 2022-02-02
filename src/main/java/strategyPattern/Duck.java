package strategyPattern;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performFly() {
        flyBehavior.fly(); // 행동 클래스에 위임
    }

    public void performQuack() {
        quackBehavior.quack(); // 행동 클래스에 위임
    }

    public void swim() {
        System.out.println("오리는 기본적으로 물에 뜹니다.");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void display() {
        System.out.println("오리입니다.");
    }
}

