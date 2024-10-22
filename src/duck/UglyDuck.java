package duck;

import behaviour.FlyWithWings;
import behaviour.Quack;

public class UglyDuck extends Duck {
    public UglyDuck() {
        setFlyBehaviour(new FlyWithWings());
        setQuackBehaviour(new Quack());
    }

}
