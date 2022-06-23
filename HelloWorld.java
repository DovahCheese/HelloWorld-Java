import javafx.scene.shape.Line;

public class HelloWorld {
    private static String goodbye = "Goodbye World";

    private static String midlife = "This World is Nice";

    public static void main(String[] args) {
        LinesToPrint.lines.add("Hello World");
        LinesToPrint.lines.add(midlife);
        LinesToPrint.lines.add(goodbye);
        LinesToPrint.createDefaultLines();
        LinesToPrint.lines.add("Dairy");
        LinesToPrint.printLines();
    }
}
