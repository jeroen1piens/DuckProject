package duck;

import behaviour.FlyNowWay;
import behaviour.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        setFlyBehaviour(new FlyNowWay());
        setQuackBehaviour(new Squeak());
    }
}
