package xyz.jelly.mediator;

public class Main {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! ");
        john.sendMessage("Hello~ ");

    }
}
