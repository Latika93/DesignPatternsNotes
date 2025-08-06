package Strategy;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();
       
        Duck model = new ModelDuck();
        model.performFly();
        model.display();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
