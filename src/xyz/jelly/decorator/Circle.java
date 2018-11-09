package xyz.jelly.decorator;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw() in circle");
    }
}
