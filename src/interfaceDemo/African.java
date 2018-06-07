package interfaceDemo;


public class African implements Human {
    @Override
    public void eat() {
        System.out.println ("吃土!!!");
    }

    @Override
    public void active() {
        System.out.println ("kill someone!");
    }
}
