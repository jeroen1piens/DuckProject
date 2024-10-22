package duck;

public class Main {
    public static void main(String[] args) {
        Duck duck = new RubberDuck();

        duck.performFly();
        duck.performQuack();

        duck = new RobotDuck();

        duck.performFly();
        duck.performQuack();

        duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();

        duck = new UglyDuck();
        duck.performFly();
        duck.performQuack();
    }
}