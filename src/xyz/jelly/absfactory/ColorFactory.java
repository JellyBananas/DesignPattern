package xyz.jelly.absfactory;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (null == color) {
            return null;
        }

        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        } else {
            return null;
        }

    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
