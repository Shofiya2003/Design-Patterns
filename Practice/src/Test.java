public class Test {
    public static void main(String[] args){
        Duck mallard=new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model=new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyingWithWings());
        model.performFly();
    }
}

