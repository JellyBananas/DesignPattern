package xyz.jelly.iterator;

public class NameRepository implements Container {
    public String names[] = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;

        @Override
        public Object next() {
            return this.hasNext() ? names[index++] : null;
        }

        @Override
        public boolean hasNext() {
            return index < names.length;
        }
    }

}
