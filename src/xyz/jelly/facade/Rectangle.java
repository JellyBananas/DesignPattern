package xyz.jelly.facade;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw() in Rectangle");
    }
}
