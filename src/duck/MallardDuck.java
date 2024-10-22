package duck;

import behaviour.FlyWithWings;
import behaviour.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyBehaviour(new FlyWithWings());
        setQuackBehaviour(new Quack());
    }
}
