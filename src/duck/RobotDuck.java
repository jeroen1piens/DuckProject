package duck;

import behaviour.FlyRocketPowered;
import behaviour.Quack;

public class RobotDuck extends Duck {
    public RobotDuck() {
        setFlyBehaviour(new FlyRocketPowered());
        setQuackBehaviour(new Quack());
    }
}
