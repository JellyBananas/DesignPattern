package xyz.jelly.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementosList = new ArrayList<>();

    public void add(Memento state) {
        mementosList.add(state);
    }

    public Memento get(int index) {
        return mementosList.get(index);
    }
}
