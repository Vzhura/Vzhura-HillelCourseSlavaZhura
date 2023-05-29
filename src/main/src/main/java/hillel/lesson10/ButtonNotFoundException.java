package hillel.lesson10;

public class ButtonNotFoundException extends RuntimeException {
    public ButtonNotFoundException(String name, String locator) {
        super("Button " + name + " was not found; locator: " + locator);
    }
}
