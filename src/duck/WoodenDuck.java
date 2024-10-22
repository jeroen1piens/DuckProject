package duck;

import behaviour.FlyNowWay;
import behaviour.MuteQuack;

public class WoodenDuck extends Duck {
    public WoodenDuck() {
        setFlyBehaviour(new FlyNowWay());
        setQuackBehaviour(new MuteQuack());
    }
}
