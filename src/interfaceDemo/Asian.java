package interfaceDemo;

public class Asian implements Human{

    @Override
    public void eat() {
        System.out.println ("eat some food!");
    }

    @Override
    public void active() {
        System.out.println ("play game!");
    }
}
