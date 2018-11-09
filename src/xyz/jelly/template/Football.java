package xyz.jelly.template;

public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("F init");
    }

    @Override
    void startPlay() {
        System.out.println("F start");
    }

    @Override
    void endPlay() {
        System.out.println("F end");
    }
}
