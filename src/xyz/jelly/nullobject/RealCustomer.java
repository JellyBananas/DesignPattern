package xyz.jelly.nullobject;

public class RealCustomer extends AbstractCustomer {
    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean inNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
