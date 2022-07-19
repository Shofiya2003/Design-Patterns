public class MallardDuck extends Duck{
    public MallardDuck(){
        flyBehavior=new FlyingWithWings();
        quackBehavior=new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a Mallard Duck!");
    }
}
