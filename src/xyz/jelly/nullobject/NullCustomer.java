package xyz.jelly.nullobject;

public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean inNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
