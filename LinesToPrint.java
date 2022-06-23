import java.util.*;

public class LinesToPrint {
    public static List<String> lines = new ArrayList<String>();

    public static void main(String[] args) {
        lines.add("Cheese");
        lines.add("Milk");
        lines.add("Butter");

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
