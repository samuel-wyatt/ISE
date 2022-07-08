import java.io.*;
public class TestUtils {
    public static void main(String[] args) {
        testPrintCoordinates();
    }

    public static void testPrintCoordinates() {
        ByteArrayOutputStream capOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(capOut));

        Utils.printCoordinates(3.4, 4.8, 5.6);
        assert "(3.40, 4.80, 5.60)".equals(capOut.toString());
    }
}
