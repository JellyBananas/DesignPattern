package xyz.jelly.proxy;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("Test.jpg");
        image.display();

        System.out.println();

        image.display();
    }
}
