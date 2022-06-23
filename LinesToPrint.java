import java.util.*;

public class LinesToPrint {
    public static List<String> lines = new ArrayList<String>();

    public static void main(String[] args) {
        createDefaultLines();
        printLines();
    }

    public static void createDefaultLines() {
        lines.add("Cheese");
        lines.add("Milk");
        lines.add("Butter");

    }
    public static void printLines() {
        for (String line : lines) {
            System.out.println(line);

        }
    }
}
