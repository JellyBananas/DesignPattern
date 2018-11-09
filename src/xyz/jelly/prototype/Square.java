package xyz.jelly.prototype;

public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("draw() in Square");
    }
}
