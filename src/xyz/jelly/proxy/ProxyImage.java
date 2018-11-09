package xyz.jelly.proxy;

public class ProxyImage implements Image {

    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (null == realImage) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
