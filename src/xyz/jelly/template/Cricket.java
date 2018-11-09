package xyz.jelly.template;

public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("C init");
    }

    @Override
    void startPlay() {
        System.out.println("C start");
    }

    @Override
    void endPlay() {
        System.out.println("C end");
    }
}
